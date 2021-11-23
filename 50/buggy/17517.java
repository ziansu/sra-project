@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.setClass(this, cn.y1n9k17.emergencycalldialer.MainActivity.class);
    startActivity(intent);
    finish();
}