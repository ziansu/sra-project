private static boolean elementHasPropertySatisfyFilter(com.orientechnologies.orient.core.record.impl.ODocument elementDoc, org.ndexbio.common.query.filter.orientdb.PropertyFilterODB filter) {
    for (com.orientechnologies.orient.core.record.impl.ODocument propDoc : org.ndexbio.common.models.dao.orientdb.Helper.getDocumentLinks(elementDoc, "out_", NdexClasses.E_ndexProperties)) {
        if (propDoc.getClassName().equals(NdexClasses.NdexProperty)) {
            if (org.ndexbio.common.query.NetworkFilterQueryExecutor.propertySatisfyFilter(propDoc, filter)) {
                return true;
            }
        }
    }
    return false;
}