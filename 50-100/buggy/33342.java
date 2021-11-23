public static void main(java.lang.String[] args) {
    BSTree<java.lang.Integer> bs = new BSTree<java.lang.Integer>();
    for (int i = 0; i < 3; i++) {
        bs.add(i);
    }
    bs.inOrder();
    java.lang.System.out.println(bs);
}