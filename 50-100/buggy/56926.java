private void removeMappingRlocs(java.util.Map.Entry<org.opendaylight.lispflowmapping.interfaces.dao.IMappingServiceKey, java.util.List<org.opendaylight.lispflowmapping.interfaces.dao.MappingServiceRLOCGroup>> mapping, org.opendaylight.lispflowmapping.interfaces.dao.ILispDAO db) {
    for (org.opendaylight.lispflowmapping.interfaces.dao.MappingServiceRLOCGroup group : mapping.getValue()) {
        for (org.opendaylight.yang.gen.v1.urn.opendaylight.lfm.control.plane.rev150314.locatorrecords.LocatorRecord record : group.getRecords()) {
            db.removeSpecific(mapping.getKey(), getAddressKey(record.getLispAddressContainer().getAddress()));
        }
    }
}