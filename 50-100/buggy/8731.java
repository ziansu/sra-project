public static void main(java.lang.String[] args) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>();
    list.addAll(java.util.Arrays.asList(5, 5, 3, 5, 3, 8, 5, 6, 5, 7, 3, 1));
    java.lang.System.out.println(MajorityElements.findElement(list, 3));
}