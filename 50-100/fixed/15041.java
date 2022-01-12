@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case com.luminousmossboss.luminous.MainActivity.REQUEST_TAKE_PHOTO :
            {
                if (resultCode == (RESULT_OK)) {
                    handlePhoto(data);
                }
                break;
            }
    }
}