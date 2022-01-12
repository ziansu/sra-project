public static void printList(java.util.List<java.lang.Object> objects) throws java.lang.IllegalArgumentException {
    CodingUtils.AssertUtils.assertNotNull(objects);
    for (java.lang.Object object : objects) {
        java.lang.System.out.println(object);
    }
}