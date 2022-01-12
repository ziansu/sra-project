private java.lang.String[] getValues(java.util.List<com.ctrip.platform.dal.daogen.resource.Parameter> list) {
    int length = list.size();
    if ((list == null) || (length == 0)) {
        return null;
    }
    java.lang.String[] array = new java.lang.String[length];
    int index = 0;
    for (com.ctrip.platform.dal.daogen.resource.Parameter p : list) {
        array[index] = p.getValue();
        index++;
    }
    return array;
}