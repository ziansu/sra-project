public static void main(java.lang.String[] args) {
    com.javastud.springmvcweb.designpatterns.singleton.Company comp1 = com.javastud.springmvcweb.designpatterns.singleton.Company.getInstance();
    java.lang.System.out.println(comp1);
    com.javastud.springmvcweb.designpatterns.singleton.Company comp2 = com.javastud.springmvcweb.designpatterns.singleton.Company.getInstance();
    java.lang.System.out.println(comp2);
    java.lang.System.out.println((comp1 == comp2));
    try {
        java.lang.Runtime r = java.lang.Runtime.getRuntime();
        r.exec("calc");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}