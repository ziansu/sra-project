@java.lang.Override
public void onStartup() {
    if ((this.zeroPage) != null)
        return ;
    
    this.zeroPage = java.nio.ByteBuffer.allocateDirect(pageSize).order(java.nio.ByteOrder.nativeOrder());
}