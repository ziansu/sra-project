public java.lang.String[] getStringArray() {
    java.lang.String str = getLine();
    if (str != null) {
        java.lang.String[] splittedLine = str.split("\\s+");
        return splittedLine;
    }else {
        java.lang.System.out.println("ERR");
        return null;
    }
}