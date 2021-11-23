public java.lang.String getIPAdress() {
    if ((com.fileShare.Server._socket) != null) {
        java.lang.System.out.println(((("L'ip que je dois afficher est : " + (com.fileShare.Server._socket.getInetAddress().getHostAddress())) + "/") + (com.fileShare.Server._socket.getLocalPort())));
        return ((com.fileShare.Server._socket.getInetAddress().getHostAddress()) + "/") + (com.fileShare.Server._socket.getLocalPort());
    }else
        return null;
    
}