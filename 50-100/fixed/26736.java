private java.lang.String[] getValues(java.util.List<com.ctrip.platform.dal.daogen.resource.Parameter> list) {
    if ((list == null) || ((list.size()) == 0)) {
        return new java.lang.String[0];
    }
    java.lang.String[] array = new java.lang.String[list.size()];
    int index = 0;
    for (com.ctrip.platform.dal.daogen.resource.Parameter p : list) {
        array[index] = p.getValue();
        index++;
    }
    return array;
}