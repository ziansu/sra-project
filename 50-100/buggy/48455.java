@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    switch (requestCode) {
        case 100 :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                java.lang.String result = intent.getStringExtra("result");
                this.callbackContext.success(result);
            }else {
                java.lang.String message = intent.getStringExtra("result");
                this.callbackContext.error(message);
            }
            break;
        default :
            break;
    }
}