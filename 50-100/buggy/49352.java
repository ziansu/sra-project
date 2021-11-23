public  arg1() {
    if ((type) == "C_ARITHMETIC") {
        return command;
    }else
        if (((type) == "C_PUSH") || ((type) <= "C_POP")) {
            return command.split(" ")[1];
        }
    
}