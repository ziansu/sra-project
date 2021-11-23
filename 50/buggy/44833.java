@java.lang.Override
public void startActivity(android.content.Intent intent) {
    super.startActivity(intent);
    if ((drawer) != null)
        drawer.closeDrawer();
    
    overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
}