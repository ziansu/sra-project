@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if ((this.eventDelegate) != null)
        this.eventDelegate.onPostExecute(complaintArray);
    
}