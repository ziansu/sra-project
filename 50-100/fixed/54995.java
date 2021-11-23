public static void main(java.lang.String[] args) {
    com.thoughtworks.tw101.exercises.exercise9.Node root = new com.thoughtworks.tw101.exercises.exercise9.Node("Cecil");
    root.add("Michelle");
    root.add("Bill");
    root.add("Jagruti");
    root.add("Tess");
    root.add("Sue-Ellen");
    root.add("Sara");
    root.add("Casey");
    java.util.List<java.lang.String> names = root.names();
    for (java.lang.String name : names) {
        java.lang.System.out.println(name);
    }
}