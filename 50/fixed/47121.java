@java.lang.Override
public boolean layoutDependsOn(android.support.design.widget.CoordinatorLayout parent, android.support.design.widget.FloatingActionButton fab, android.view.View dependency) {
    return (super.layoutDependsOn(parent, fab, dependency)) || (dependency instanceof android.support.design.widget.AppBarLayout);
}