@java.lang.Override
public boolean onStartNestedScroll(android.support.design.widget.CoordinatorLayout parent, android.support.design.widget.AppBarLayout child, android.view.View directTargetChild, android.view.View target, int nestedScrollAxes, int type) {
    if (super.onStartNestedScroll(parent, child, directTargetChild, target, nestedScrollAxes, type)) {
        bindChild(child);
        mOriginTop = child.getY();
        mAppBarLayout.stopScrollAnimation();
        return true;
    }else {
        return false;
    }
}