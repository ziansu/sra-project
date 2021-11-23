@java.lang.Override
public void onReject() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), fr.pchab.androidrtc.MainActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivity(intent);
}