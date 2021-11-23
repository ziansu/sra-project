public void close() {
    try {
        if ((sOutput) != null)
            sOutput.close();
        
    } catch (java.io.IOException e) {
    }
    try {
        if ((sInput) != null)
            sInput.close();
        
    } catch (java.io.IOException e) {
    }
    try {
        if ((socket) != null)
            socket.close();
        
    } catch (java.io.IOException e) {
    }
    removeUser(user);
    remove(this);
}