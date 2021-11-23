@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if ((this.eventDelegate) != null)
        this.eventDelegate.onPreExecute();
    
}