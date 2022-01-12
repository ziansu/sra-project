@java.lang.Override
public android.support.v4.widget.DrawerLayout onCreateDrawerLayout() {
    if (((findViewById(R.id.app__drawer_layout)) == null) || (((findViewById(R.id.app__drawer_layout)) != null) && (!((findViewById(R.id.app__drawer_layout)) instanceof android.support.v4.widget.DrawerLayout)))) {
        throw new java.lang.IllegalStateException("Activity must have on layout a android.support.v4.widget.DrawerLayout with id R.id.app__drawer_layout");
    }
    return ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.app__drawer_layout)));
}