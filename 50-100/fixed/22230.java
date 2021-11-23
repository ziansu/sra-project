@java.lang.Override
public void setContentView(@android.support.annotation.LayoutRes
int layoutResID) {
    fullView = ((android.support.v4.widget.DrawerLayout) (getLayoutInflater().inflate(R.layout.activity_base, null)));
    activityContainer = ((android.widget.FrameLayout) (fullView.findViewById(R.id.content_frame)));
    getLayoutInflater().inflate(layoutResID, activityContainer, true);
    super.setContentView(layoutResID);
    onCreateDrawer();
}