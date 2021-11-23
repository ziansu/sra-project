@java.lang.Override
protected void onResume() {
    super.onResume();
    menu.hideNavBar(this.getWindow());
    try {
        if ((PauseMenuActivity.pause) == true) {
            PauseMenuActivity.pause = false;
        }
        v.resume();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}