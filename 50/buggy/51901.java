public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_BACK :
            android.content.Intent intent = new android.content.Intent(this, com.system.dormitory.dormitory_system_android.activity_main.Manager.Activity_Manager_Rental.class);
            startActivity(intent);
            finish();
            return false;
        default :
            return false;
    }
}