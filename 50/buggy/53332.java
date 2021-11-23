public static void main(java.lang.String[] args) {
    com.sh.simple.Factory f = new com.sh.simple.Factory();
    com.sh.simple.Parent p = f.createProduct("two");
    java.lang.System.out.println(p.car());
}