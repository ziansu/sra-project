protected void onPostExecute(java.lang.Integer result) {
    progress.setVisibility(View.GONE);
    mSwipeRefreshLayout.setRefreshing(false);
    if (result == (com.lucaszanella.sisgrad.MessagesFragment.GetMessages.OK)) {
        new com.lucaszanella.sisgrad.MessagesFragment.LoadNewMessage().execute();
        new com.lucaszanella.sisgrad.MessagesFragment.LoadNewMessage().execute();
        new com.lucaszanella.sisgrad.MessagesFragment.LoadNewAvatar().execute();
    }else
        if (result == (com.lucaszanella.sisgrad.MessagesFragment.GetMessages.TIMEOUT)) {
        }
    
}