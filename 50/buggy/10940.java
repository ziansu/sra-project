private void result(java.lang.String data) {
    if (!(cb))
        return ;
    
    cb.success(data);
    cb = null;
}