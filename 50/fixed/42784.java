private void genHook() {
    if (com.comcast.zucchini.AbstractZucchiniTest.hooked)
        return ;
    
    synchronized(com.comcast.zucchini.AbstractZucchiniTest.hooked) {
        if (com.comcast.zucchini.AbstractZucchiniTest.hooked)
            return ;
        
        com.comcast.zucchini.AbstractZucchiniTest.hooked = true;
    }
    java.lang.Runtime.getRuntime().addShutdownHook(new com.comcast.zucchini.ZucchiniShutdownHook());
}