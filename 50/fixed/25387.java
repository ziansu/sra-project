public void writeln(java.lang.String... str) {
    if (str == null)
        return ;
    
    for (java.lang.String s : str) {
        res.writeln(s);
    }
}