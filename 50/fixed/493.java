@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.example.kamil.projectapp.HTTPRequestHandler requestHandler = com.example.kamil.projectapp.HTTPRequestHandler.getInstance();
    requestHandler.PostBreakIn(true);
    return null;
}