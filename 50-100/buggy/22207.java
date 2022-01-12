@java.lang.Override
public void onLoadingMore() {
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... params) {
            bl.CampusBLService.getNextLatestPosts();
            return null;
        }

        @java.lang.Override
        protected void onPostExecute(java.lang.Void result) {
            if ((CampusBLService.nextLatestPosts.size()) != 0) {
                bl.CampusBLService.moveLatestPosts();
                adapter.notifyDataSetChanged();
            }
            container.hideFooterView();
        }
    }.execute(new java.lang.Void[]{  });
}