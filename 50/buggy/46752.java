private void addUnknownTypes() {
    for (java.lang.String type : unknownTypes) {
        sernet.gs.ui.rcp.gsimport.GstoolImportMappingElement mappingEntry = new sernet.gs.ui.rcp.gsimport.GstoolImportMappingElement(type, GstoolImportMappingElement.UNKNOWN);
        sernet.gs.ui.rcp.gsimport.GstoolTypeMapper.addGstoolSubtypeToPropertyFile(mappingEntry);
    }
}