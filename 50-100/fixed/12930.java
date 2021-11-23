@java.lang.Override
public void printData() {
    java.lang.System.out.println(("=> Directory= " + (this.path)));
    if ((this.files.size()) > 0)
        java.lang.System.out.println("     Files: ");
    else
        java.lang.System.out.println("     <no files>");
    
    for (int i = 0; i < (this.files.size()); ++i)
        java.lang.System.out.println(("     - " + (this.files.get(i))));
    
}