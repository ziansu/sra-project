public void getIfElseReport() {
    if (this.ifOrElse.equals("if"))
        java.lang.System.out.println((((((this.line.trim()) + " : ") + "possibly a one line if") + " at line ") + (this.lineNumber)));
    else
        if (this.ifOrElse.equals("else"))
            java.lang.System.out.println((((((this.line.trim()) + " : ") + "possibly a one line else") + " at line ") + (this.lineNumber)));
        else
            return ;
        
    
}