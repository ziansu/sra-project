public static void removeDuplicates(org.basex.web.servlet.impl.ArrayList<?> arlList) {
    org.basex.web.servlet.impl.Set set = new org.basex.web.servlet.impl.HashSet();
    org.basex.web.servlet.impl.List newList = new org.basex.web.servlet.impl.ArrayList();
    for (org.basex.web.servlet.impl.Iterator iter = arlList.iterator(); iter.hasNext();) {
        java.lang.Object element = iter.next();
        if (set.add(element))
            newList.add(element);
        
    }
    arlList.clear();
    arlList.addAll(newList);
}