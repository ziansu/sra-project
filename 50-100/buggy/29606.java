public void setState(boolean b) {
    if (b == (this.state))
        return ;
    
    this.state = b;
    if (b) {
        try {
            this.loadConfig();
            this.init();
        } catch (java.lang.Exception e) {
            kclient.tools.Logger.get().error(e);
        }
    }else {
        this.onAppStop();
    }
}