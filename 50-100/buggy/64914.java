public java.util.Iterator<org.yafra.model.MYafraUser> iterator(final int first, final int count) {
    java.util.List<org.yafra.model.MYafraUser> newList = new java.util.ArrayList<org.yafra.model.MYafraUser>(list.getObject());
    java.util.Collections.sort(newList, comparator);
    return newList.subList(first, (first + count)).iterator();
}