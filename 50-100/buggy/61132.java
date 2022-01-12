@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case kagy.com.calldaemon.MainActivity.PICK_CONTACT_CODE :
            onPickActivityResult(data);
            break;
        case kagy.com.calldaemon.MainActivity.CALL_INTENT_CODE :
            onCallActivityResult();
            break;
        default :
            super.onActivityResult(requestCode, resultCode, data);
    }
}