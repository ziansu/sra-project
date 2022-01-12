public static void main(java.lang.String[] args) {
    BSTree<java.lang.Integer, java.lang.String> mytree = new BSTree<java.lang.Integer, java.lang.String>();
    mytree.add(5, "Hey");
    mytree.add(10, "Boy");
    mytree.add(15, "dei");
    mytree.add(2, "doi");
    java.lang.System.out.printf("%d\n", mytree.size(5));
}