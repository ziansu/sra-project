@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if (isElder()) {
            startActivity(new android.content.Intent(this, com.project.chengwei.project_v2.HomeActivity.class));
            finish();
        }else {
            startActivity(new android.content.Intent(this, com.project.chengwei.project_v2.FamilyActivity.class));
            finish();
        }
    }
    return super.onKeyDown(keyCode, event);
}