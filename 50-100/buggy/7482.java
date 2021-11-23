public java.util.List<T> subList(int startIndex, int numberOfItems) {
    java.util.List<T> idList = this.toImmutableList();
    return idList.subList((startIndex - (offset)), java.lang.Math.min(numberOfItems, maxValidIndex));
}