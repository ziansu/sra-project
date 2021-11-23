private void showMenuDialog1(int position, android.view.MotionEvent motionEvent) {
    StartupMenuActivity.mStartMenuDialog.setPosition(position);
    int[] location = new int[2];
    StartupMenuActivity.mStartMenuDialog.showDialog((((int) (motionEvent.getRawX())) - (location[0])), ((((int) (motionEvent.getRawY())) - (location[1])) + (com.android.documentsui.StartupMenuAdapter.START_MENU_RIGHT_MOUSE_UI_NUMBER)), com.android.documentsui.StartupMenuAdapter.START_MENU_RIGHT_MOUSE_UI_X, com.android.documentsui.StartupMenuAdapter.START_MENU_RIGHT_MOUSE_UI_Y);
}