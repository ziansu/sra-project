@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if (((adapter) == null) || ((adapter.getCount()) == 0))
        this.progressBar.show();
    
}