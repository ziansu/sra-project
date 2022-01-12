@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parentView, android.view.View selectedItemView, int position, long id) {
    updateView(var, clients, ((var.monthSpinner.getSelectedItemPosition()) + 1), java.lang.Integer.parseInt(var.yearSpinner.getSelectedItem().toString()));
    var.setSubtitle(((org.ei.opensrp.commonregistry.CommonPersonObjectClient) (clients.get(4))).getDetails().get("desa"));
}