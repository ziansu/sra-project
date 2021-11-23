public java.lang.String commandType() {
    if (type.equals("push")) {
        type = "C_PUSH";
    }else
        if (type.equals("pop")) {
            type = "C_POP";
        }else {
            type = "C_ARITHMETIC";
        }
    
    return type;
}