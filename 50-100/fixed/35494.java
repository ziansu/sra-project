public static void main(java.lang.String[] args) {
    MyHeap a = new MyHeap(true);
    for (int i = 0; i < 10; i++) {
        a.add(i);
        java.lang.System.out.println(a);
    }
    for (int i = 0; i < 9; i++) {
        a.remove();
        java.lang.System.out.println(a);
    }
    java.lang.System.out.println(a);
}