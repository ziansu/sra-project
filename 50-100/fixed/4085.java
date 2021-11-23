@java.lang.Override
public void onClick(android.view.View v) {
    {
        if ((usedArray) != null) {
            java.lang.String sub = usedArray.get(pager.getCurrentItem());
            if ((!(sub.equals("frontpage"))) && (!(sub.equals("all")))) {
                ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout))).openDrawer(Gravity.RIGHT);
            }
        }
    }
}