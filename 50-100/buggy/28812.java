@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_add :
            android.content.Intent intent = new android.content.Intent(ctx, fry.oldschool.activity.TaskCreateActivity.class);
            ctx.startActivity(intent);
            return true;
        case R.id.action_settings :
            MainActivity.fm.beginTransaction().replace(R.id.frame_fragment_main, new fry.oldschool.fragment.TaskCreateFragment()).commit();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}