public void printData() {
    java.lang.System.out.println(("=> Directory= " + (this.path)));
    if ((files.size()) > 0)
        java.lang.System.out.println("     Files: ");
    else
        java.lang.System.out.println("     <no files>");
    
    for (int i = 0; i < (files.size()); ++i)
        java.lang.System.out.println(("     - " + (files.get(i))));
    
}