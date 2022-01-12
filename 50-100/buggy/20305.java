public java.lang.String toString() {
    java.lang.String str;
    if ((type) == 1)
        str = "space tile";
    
    if ((type) == 2)
        str = "asteroid tile";
    
    if ((type) == 3)
        str = "resource tile";
    
    if ((type) == 4)
        str = "ship tile";
    
    if ((type) == 5)
        str = "shop tile";
    else
        str = "blank tile";
    
    return str;
}