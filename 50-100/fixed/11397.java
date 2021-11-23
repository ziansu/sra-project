public static void main(java.lang.String[] args) {
    boolean a = false;
    boolean b = false;
    boolean c = true;
    boolean p = (((a || b) || c) && (((!a) || b) || c)) && (((!a) || (!b)) || c);
    java.lang.System.out.println(p);
}