public static void main(java.lang.String[] args) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    while (scan.hasNext()) {
        java.lang.String str = scan.next();
        tree.SuffixTree st = new tree.SuffixTree(str);
        st.build(false);
        st.print();
    } 
}