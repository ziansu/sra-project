@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if ((((sortby) != null) || ((search) != null)) && (((messages) != null) && (!(messages.isEmpty()))))
        progress.setVisibility(View.INVISIBLE);
    else
        if (!(swipe.isRefreshing()))
            progress.setVisibility(View.VISIBLE);
        
    
}