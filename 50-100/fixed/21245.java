public static <E> java.util.List<E> asList(E... elements) {
    java.util.List<E> list = new java.util.ArrayList<E>(elements.length);
    for (E element : elements) {
        list.add(element);
    }
    java.util.Arrays.asList(elements);
    return list;
}