public static void main(java.lang.String[] args) {
    @org.checkerframework.checker.nullness.qual.NonNull
    EXP01J.List<java.lang.@org.checkerframework.checker.nullness.qual.Nullable
    String> myList = new EXP01J.ArrayList<java.lang.@org.checkerframework.checker.nullness.qual.Nullable
    String>();
    myList.add("Java");
    myList.add("C");
    myList.add(null);
    myList.add("C++");
    java.lang.System.out.println(("Cardinality of myList: " + (EXP01J.Cardinality.cardinality("C", myList))));
    java.lang.System.out.println(("Cardinality of myList: " + (EXP01J.Cardinality.cardinality(null, myList))));
}