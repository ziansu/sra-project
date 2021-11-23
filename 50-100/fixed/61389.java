private java.util.List<ezvcard.parameter.TelephoneType> parseTelephoneTypes(java.lang.String typesStr) {
    java.util.List<ezvcard.parameter.TelephoneType> types = new java.util.ArrayList<ezvcard.parameter.TelephoneType>();
    java.lang.String[] typeSplitStrArray = org.apache.commons.lang.StringUtils.split(typesStr, ";");
    if (null == typeSplitStrArray) {
        return types;
    }
    for (java.lang.String typeSplit : typeSplitStrArray) {
        ezvcard.parameter.TelephoneType type = ezvcard.parameter.TelephoneType.find(typeSplit);
        if (null != type) {
            types.add(type);
        }
    }
    return types;
}