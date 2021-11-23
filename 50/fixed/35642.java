@java.lang.Override
protected void sendOtherHeaders() {
    if (badFormat)
        return ;
    
    super.sendOtherHeaders();
}