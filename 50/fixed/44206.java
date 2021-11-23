void display(java.lang.String s) {
    if ((out) == null) {
        java.lang.System.out.println(s);
    }else {
        out.display(s);
    }
}