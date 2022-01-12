public static void removeDuplicates(java.util.ArrayList<?> arlList) {
    java.util.Set set = new java.util.HashSet();
    java.util.List newList = new java.util.ArrayList();
    for (java.util.Iterator iter = arlList.iterator(); iter.hasNext();) {
        java.lang.Object element = iter.next();
        if (set.add(element))
            newList.add(element);
        
    }
    arlList.clear();
    arlList.addAll(newList);
}