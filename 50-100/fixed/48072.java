@java.lang.Override
protected void onPostExecute(org.linphone.setup.JsonConfig res) {
    super.onPostExecute(res);
    if (res != null) {
        if ((listener) != null)
            listener.onParsed(res);
        
    }else {
        if ((listener) != null)
            listener.onFailed(errorMsg);
        
    }
}