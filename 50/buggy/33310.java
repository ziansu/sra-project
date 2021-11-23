@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, id.ac.its.ezlyn.TutorialActivity.class);
    startActivity(intent);
    finish();
}