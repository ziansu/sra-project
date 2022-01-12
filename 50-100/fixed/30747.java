@java.lang.Override
protected void onPostExecute(java.lang.Object result) {
    this.progressDialog.dismiss();
    if (result instanceof com.nodoubts.core.Subject) {
        java.util.List<com.nodoubts.core.Subject> subjects = new java.util.ArrayList<com.nodoubts.core.Subject>();
        subjects.add(((com.nodoubts.core.Subject) (result)));
        com.nodoubts.core.SearchAdapter<com.nodoubts.core.Subject> subjectsAdapter = new com.nodoubts.core.SearchAdapter<com.nodoubts.core.Subject>(this, subjects);
        listView.setAdapter(subjectsAdapter);
    }else {
    }
}