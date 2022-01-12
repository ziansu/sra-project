private void result(java.lang.String data) {
    if ((cb) == null)
        return ;
    
    cb.success(data);
    cb = null;
}