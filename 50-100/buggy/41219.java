@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if ((cijfers) == null) {
        eu.magisterapp.magister.Alerts.notify(getContext(), "Er zijn geen cijfers gevonden").show();
    }else {
        if ((adapter) == null)
            adapter = new eu.magisterapp.magister.ResourceAdapter(cijfers);
        else
            adapter.swap(cijfers);
        
    }
}