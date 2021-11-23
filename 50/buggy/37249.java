private int calcRowSize(java.util.List<java.util.Collection<?>> lists) {
    return lists.stream().map(java.util.Collection::size).reduce(( a, b) -> a * b).orElse(0);
}