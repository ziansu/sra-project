@java.lang.Override
protected java.lang.Object doInBackground(java.lang.String... params) {
    try {
        com.nodoubts.core.Subject subject = subjectService.getSubject(params[0]);
        return subject;
    } catch (com.nodoubts.exceptions.ApplicationViewException e) {
        android.util.Log.i(this.getClass().getName(), ("Error: " + (e.getMessage())));
        return e;
    }
}