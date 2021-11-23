@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.example.brandon.habitlogger.common.RequestCodes.SETTINGS_ACTIVITY)) {
        recreate();
    }else
        if (resultCode == (RESULT_OK)) {
            switch (requestCode) {
                case com.example.brandon.habitlogger.DataExportHelpers.GoogleDriveDataExportManager.REQUEST_CODE_RESOLUTION :
                    {
                        googleDrive.connect();
                    }
                    break;
            }
        }
    
}