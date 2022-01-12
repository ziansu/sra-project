public static void main(java.lang.String[] args) {
    com.sh.simple.Parent p;
    p = com.sh.simple.Factory.createProduct("two");
    java.lang.System.out.println(p.car());
}