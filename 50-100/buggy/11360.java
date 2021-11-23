protected java.lang.String getDataStorePath(final java.lang.String dataStore, final java.lang.String context) {
    if (org.opendaylight.netconf.sal.rest.doc.impl.BaseYangSwaggerGenerator.newDraft) {
        if (("config".contains(dataStore)) || ("operational".contains(dataStore))) {
            return (("/" + (org.opendaylight.netconf.sal.rest.doc.impl.BaseYangSwaggerGenerator.RESTCONF_DRAFT)) + "/data") + context;
        }else {
            return (("/" + (org.opendaylight.netconf.sal.rest.doc.impl.BaseYangSwaggerGenerator.RESTCONF_DRAFT)) + "/operations") + context;
        }
    }else {
        return ("/" + dataStore) + context;
    }
}