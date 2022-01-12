@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mP1 = ((com.app.restfulapp.models.Member) (parent.getSelectedItem()));
    if ("".equalsIgnoreCase(mP1.getCode()))
        return ;
    
    updateP2();
}