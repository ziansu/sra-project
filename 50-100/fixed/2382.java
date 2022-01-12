private void printHeader(java.io.PrintStream p) {
    p.println(("nb csq " + (java.lang.Integer.toString(this.getClauses().size()))));
    java.lang.String t;
    if ((this.timeOut) == true)
        t = "1";
    else
        t = "0";
    
    p.println(("timeout " + t));
}