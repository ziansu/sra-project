private static int getIndexOf(java.lang.String name) {
    for (int i = 0; i < (ogame.utility.Resource.names.length); i++) {
        if ((ogame.utility.Resource.names[i]) == name) {
            return i;
        }
    }
    return -1;
}