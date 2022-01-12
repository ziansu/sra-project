private void merge(java.util.List list1, java.util.List list2) {
    if ((list2 != null) && (list1 != null)) {
        for (java.lang.Object object : list2) {
            list1.add(object);
        }
    }
}