@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    try {
        java.lang.String css = "<style type='text/css'>img {height: auto ;max-width: 100%;}</style>";
        webView.setVisibility(View.VISIBLE);
        webView.loadData((css + result), "text/html; charset=utf-8", "UTF-8");
    } catch (java.lang.Error | java.lang.Exception er) {
        java.lang.System.out.println(er);
    }
}