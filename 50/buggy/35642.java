@java.lang.Override
protected void sendOtherHeaders() {
    if (badFormat)
        return ;
    
    resourceLength = sb.length();
    super.sendOtherHeaders();
}