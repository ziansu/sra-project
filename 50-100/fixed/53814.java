@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == 3) || (requestCode == 1)) {
        int RESULT_NEXT = 10;
        if (resultCode == (RESULT_OK)) {
        }else
            if (resultCode == RESULT_NEXT) {
                android.content.Intent datas = new android.content.Intent();
                setResult(STATION_BEENDET, datas);
                onBackPressed();
            }
        
    }
}