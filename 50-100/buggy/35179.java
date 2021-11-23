public static void main(java.lang.String[] args) {
    java.lang.Integer[] arr = new java.lang.Integer[]{ 12 , 34 , 56 , 78 , 98 , 23 };
    java.util.List<java.lang.Integer> aList = new java.util.ArrayList<java.lang.Integer>(java.util.Arrays.asList(arr));
    java.lang.System.out.println(arr[2]);
    aList.set(2, 22);
    java.lang.System.out.println(arr[2]);
}