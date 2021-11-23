@java.lang.Override
protected void onDestroy() {
    if ((sr) != null)
        sr.destroy();
    
    if ((m) != null)
        m.release();
    
    super.onDestroy();
}