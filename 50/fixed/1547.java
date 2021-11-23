@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((sr) != null)
        sr.destroy();
    
    if ((m) != null)
        m.release();
    
}