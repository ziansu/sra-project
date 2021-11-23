private boolean isStartMessage(java.lang.String value) {
    if (value != null)
        java.lang.System.out.print(value);
    
    return value.contains(startupMessage);
}