@java.lang.Override
protected void onResume() {
    super.onResume();
    menu.hideNavBar(this.getWindow());
    try {
        if ((PauseMenuActivity.pause) == true) {
            PauseMenuActivity.pause = false;
            (com.asus_s550cb.theo.museum.StartGame.startingStage)--;
        }
        v.resume();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    (com.asus_s550cb.theo.museum.StartGame.startingStage)++;
}