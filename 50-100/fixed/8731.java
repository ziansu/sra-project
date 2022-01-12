public static void main(java.lang.String[] args) {
    java.util.List<java.lang.Integer> list = new java.util.ArrayList<java.lang.Integer>();
    list.addAll(java.util.Arrays.asList(0, 0, 1, 7, 1, 1));
    java.lang.System.out.println(MajorityElements.findElement(list, 3));
}