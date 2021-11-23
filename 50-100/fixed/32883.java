public java.lang.String getCommand(int but) {
    if (but == (-1))
        return "null";
    
    java.lang.String[][] gui = menu_structure.get(getState());
    if (gui[but][0].equals("butn")) {
        try {
            return gui[but][1];
        } catch (java.lang.IndexOutOfBoundsException e) {
            return "null";
        }
    }
    return "null";
}