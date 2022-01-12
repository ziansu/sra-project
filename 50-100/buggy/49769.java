public java.lang.String dest() {
    java.lang.String currentCommand = commands.get(index);
    if (currentCommand.contains("=")) {
        int eq = currentCommand.indexOf("=");
        return currentCommand.substring(0, eq);
    }else
        if (currentCommand.contains(";")) {
            int semi = currentCommand.indexOf(";");
            return currentCommand.substring(0, semi);
        }else {
            return "";
        }
    
}