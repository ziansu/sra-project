private int eventHandler(java.lang.String event) {
    java.lang.System.out.println(event);
    if (event.split(" ")[0].equals("+OK"))
        return okHandler(event);
    else
        if (event.split(" ")[0].equals("-ERR"))
            return errHandler(event);
        else {
            return -1;
        }
    
}