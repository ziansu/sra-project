public java.lang.String toString() {
    java.lang.String str;
    if ((this.type) == 1)
        str = "space tile";
    
    if ((this.type) == 2)
        str = "asteroid tile";
    
    if ((this.type) == 3)
        str = "resource tile";
    
    if ((this.type) == 4)
        str = "ship tile";
    
    if ((this.type) == 5)
        str = "shop tile";
    else
        str = "blank tile";
    
    return str;
}