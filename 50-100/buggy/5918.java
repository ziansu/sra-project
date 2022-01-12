@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mP1 = ((com.app.restfulapp.models.Member) (parent.getSelectedItem()));
    if (("Alert".equalsIgnoreCase(mP1.getCode())) || ("".equalsIgnoreCase(mP1.getCode())))
        return ;
    
    updateP2();
}