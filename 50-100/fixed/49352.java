public java.lang.String arg1() {
    if (type.equals("C_ARITHMETIC")) {
        return command;
    }else
        if ((type.equals("C_PUSH")) || (type.equals("C_POP"))) {
            return command.split(" ")[1];
        }else {
            return null;
        }
    
}