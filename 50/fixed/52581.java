public void sendError(java.lang.String msg) {
    if (!(this.showError))
        return ;
    
    java.lang.System.out.println(("[ERROR]" + msg));
}