@java.lang.Override
public void onClick(android.view.View view) {
    mChatPresenter.sendClicked();
    mChatBox.setText("");
}