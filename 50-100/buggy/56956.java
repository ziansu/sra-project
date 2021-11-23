private static boolean isMafReferenced(int index, java.util.List<java.util.List<java.lang.String>> tableData) {
    for (java.util.List<java.lang.String> data : tableData) {
        if (data.get(index).isEmpty()) {
            return false;
        }
    }
    return true;
}