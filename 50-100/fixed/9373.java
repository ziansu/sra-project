@java.lang.Override
public java.lang.String toString() {
    java.lang.String state = new java.lang.String();
    if ((isStatus()) == true)
        state = "on";
    else
        state = "off";
    
    return (((((((title) + ",") + (author)) + ",") + state) + ",") + (dueDate.format(formatter))) + "\n";
}