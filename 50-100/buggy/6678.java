@java.lang.Override
public boolean onDependentViewChanged(android.support.design.widget.CoordinatorLayout parent, android.support.design.widget.FloatingActionButton fab, android.view.View dependency) {
    if (dependency instanceof android.support.design.widget.AppBarLayout) {
        if ((dependency.getY()) > 0) {
            fab.show();
        }else {
            fab.hide();
        }
    }
    return true;
}