public static void main(java.lang.String[] args) {
    java.util.ArrayList<java.lang.Integer> c = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < 10; i++)
        c.add(i);
    
    for (java.lang.Integer i : c)
        java.lang.System.out.print((i + ", "));
    
}