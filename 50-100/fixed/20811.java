public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (loginRequestCode)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        task.clearValue(Task.USER_ID);
        task.clearValue(Task.USER);
    }else
        if (requestCode == (loginRequestCode))
            makePrivateTask();
        
    
}