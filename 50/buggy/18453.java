@java.lang.Override
public java.util.List<ElementType> subList(int fromIndex, int toIndex) {
    clean();
    return new org.hlib4j.collection.FilteredList(this.managedList.subList(fromIndex, toIndex), this.filter);
}