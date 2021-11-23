@java.lang.Override
public void onLoadingMore() {
    if (true) {
        new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
            @java.lang.Override
            protected java.lang.Void doInBackground(java.lang.Void... params) {
                bl.CampusBLService.getNextLatestPosts();
                return null;
            }

            @java.lang.Override
            protected void onPostExecute(java.lang.Void result) {
                bl.CampusBLService.moveLatestPosts();
                adapter.notifyDataSetChanged();
                container.hideFooterView();
                container.hideFooterView();
            }
        }.execute(new java.lang.Void[]{  });
    }else {
        container.hideFooterView();
    }
}