public void appendCode(java.lang.String append) {
    if (code.equals(""))
        code = append;
    else
        code = ((code) + '\n') + append;
    
    java.lang.System.out.println(append);
}