private int[] getTypes(java.util.List<com.ctrip.platform.dal.daogen.resource.Parameter> list) {
    int length = list.size();
    if ((list == null) || (length == 0)) {
        return null;
    }
    int[] array = new int[length];
    int index = 0;
    for (com.ctrip.platform.dal.daogen.resource.Parameter p : list) {
        array[index] = p.getType();
        index++;
    }
    return array;
}