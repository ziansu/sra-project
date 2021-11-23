@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.locon.withu.models.Story> stories) {
    if (stories != null)
        listener.onStoriesFetched(stories);
    
}