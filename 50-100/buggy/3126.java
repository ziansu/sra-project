@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
    android.view.View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
    if ((child != null) && (mGestureDetector.onTouchEvent(motionEvent))) {
        drawerManager.closeDrawer();
        switch (recyclerView.getChildLayoutPosition(child)) {
            case 1 :
                android.content.Intent intent = new android.content.Intent(this, com.example.clement.emm_project2.PreferencesActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
    return false;
}