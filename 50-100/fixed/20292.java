@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != 0) {
        java.lang.String module = moduleList.get(position);
        new com.connorboyle.elitetools.GetModificationsTask(getThisClass()).execute(module);
    }else {
        selModifications.setAdapter(null);
        disableRadioButtons();
    }
}