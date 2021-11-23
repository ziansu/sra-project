private static void processElementAtIndex(final java.util.List<java.lang.Integer> list, final int index) {
    if ((index < 0) || (index >= (list.size()))) {
        throw new java.lang.IllegalArgumentException("If you don't mind, I would prefer not to process your object...");
    }
    java.lang.System.out.println(list.get(index));
    list.set(index, null);
}