@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.game_screen, menu);
    android.view.View chatIconView = menu.findItem(R.id.action_chat).getActionView();
    if ((chatIconController) != null) {
        chatIconController.attach(chatIconView, this);
        chatIconController.connect(chatIconView, this);
    }
    return true;
}