@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    java.lang.String content = url_con.getData(params[0]);
    return content;
}