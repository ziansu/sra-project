private int[] getTypes(java.util.List<com.ctrip.platform.dal.daogen.resource.Parameter> list) {
    if ((list == null) || ((list.size()) == 0)) {
        return new int[0];
    }
    int[] array = new int[list.size()];
    int index = 0;
    for (com.ctrip.platform.dal.daogen.resource.Parameter p : list) {
        array[index] = p.getType();
        index++;
    }
    return array;
}