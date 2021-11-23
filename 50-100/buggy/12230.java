protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case 1 :
            if (resultCode == (android.app.Activity.RESULT_OK)) {
                int switchNum = data.getIntExtra(com.example.scanitgrocerystorehelper.MainActivity.DELETE_SWITCH, 0);
                if (switchNum != 0) {
                    long newNum = data.getLongExtra(com.example.scanitgrocerystorehelper.MainActivity.KEY_LIST_ID, 0);
                    if (newNum != 0)
                        deleteList(mSqlAdapter.getList(newNum));
                    
                }
            }
    }
}