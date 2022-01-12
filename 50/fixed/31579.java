@java.lang.Override
protected void onPostExecute(java.util.List<ahhhlvin.c4q.nyc.vinecodingproject.GitIssue> list) {
    super.onPostExecute(list);
    mAdapter.addIssues(list);
}