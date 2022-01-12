@java.lang.Override
public java.util.Iterator<? extends org.yafra.model.MYafraUser> iterator(long first, long count) {
    java.util.List<org.yafra.model.MYafraUser> newList = new java.util.ArrayList<org.yafra.model.MYafraUser>(list.getObject());
    java.util.Collections.sort(newList, comparator);
    return newList.subList(((int) (first)), (((int) (first)) + ((int) (count)))).iterator();
}