private boolean isStartMessage(java.lang.String value) {
    if (value == null)
        return false;
    
    java.lang.System.out.print(value);
    return value.contains(startupMessage);
}