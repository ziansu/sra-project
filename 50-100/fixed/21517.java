@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.androidd.mehrdad.europeanleague.API.FixturesHolder> list) {
    holders.clear();
    if (list != null) {
        for (int i = 0; i < (list.size()); i++) {
            holders.add(list.get(i));
        }
    }
    linear.removeView(progressBar);
}