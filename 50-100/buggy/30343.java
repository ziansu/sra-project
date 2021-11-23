@java.lang.Override
public boolean onDependentViewChanged(android.support.design.widget.CoordinatorLayout parent, android.widget.LinearLayout child, android.view.View dependency) {
    if ((dependency.getBottom()) < (child.getHeight())) {
        child.setVisibility(View.VISIBLE);
        dependency.setVisibility(View.INVISIBLE);
        child.bringToFront();
    }else {
        child.setVisibility(View.INVISIBLE);
        dependency.setVisibility(View.VISIBLE);
    }
    return super.onDependentViewChanged(parent, child, dependency);
}