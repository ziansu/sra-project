private static int getIndexOf(java.lang.String name) {
    for (int i = 0; i < (ogame.utility.Resource.names.size()); i++) {
        if ((ogame.utility.Resource.names.get(i)) == name) {
            return i;
        }
    }
    return -1;
}