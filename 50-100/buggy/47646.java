@java.lang.Override
public boolean onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l, com.mikepenz.materialdrawer.model.interfaces.IDrawerItem iDrawerItem) {
    if ((iDrawerItem.getIdentifier()) == (org.techteam.decider.gui.activities.MainActivity.LOGOUT_ID)) {
        logout();
        return true;
    }else {
        return false;
    }
}