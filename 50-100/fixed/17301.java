private double getDistance(java.util.UUID propertyTypeId, java.lang.String val0, java.lang.String val1) {
    switch (getPropertyName(propertyTypeId)) {
        case "name" :
        case "firstname" :
        case "lastname" :
            return 1 - (org.apache.commons.lang3.StringUtils.getJaroWinklerDistance(com.dataloom.datastore.linking.services.SimpleMatcher.doubleMetaphone.encode(val0), com.dataloom.datastore.linking.services.SimpleMatcher.doubleMetaphone.encode(val1)));
        default :
            return 1 - (org.apache.commons.lang3.StringUtils.getJaroWinklerDistance(val0, val1));
    }
}