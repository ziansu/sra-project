public static void main(java.lang.String[] args) {
    java.util.Random rnd = new java.util.Random();
    Node r = new Node(40);
    BST b = new BST(r);
    for (int i = 0; i < 10; i++) {
        b.insert((10 * (rnd.nextInt(10))));
    }
    java.lang.System.out.println(b);
}