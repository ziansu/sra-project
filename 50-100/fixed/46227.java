@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if (com.velsedu.praks.velseduapp.StudentDetailActivity.isActvie) {
        android.content.Intent intent = new android.content.Intent(this, com.velsedu.praks.velseduapp.StudentDetailActivity.class);
        com.velsedu.praks.velseduapp.StudentDetailActivity.isActvie = false;
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.velsedu.praks.velseduapp.MainActivity.class);
        startActivity(intent);
    }
}