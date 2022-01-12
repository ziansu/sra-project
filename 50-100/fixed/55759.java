private void writeAttributes(java.io.PrintWriter printWriter) {
    if ((attributes) == null)
        return ;
    
    for (java.lang.String key : attributes.keySet()) {
        if (key == null)
            continue;
        
        java.lang.String value = attributes.get(key);
        printWriter.print(" ");
        printWriter.print(key);
        printWriter.print("=\"");
        printWriter.print((value == null ? "" : value));
        printWriter.print('"');
    }
}