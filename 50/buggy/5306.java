@java.lang.Override
public java.lang.String action() {
    try {
        name = consoleIO.read();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if (movieList.returnMovie(name))
        return unSuccessfulReturnMsg;
    
    return successfulReturnMsg;
}