@java.lang.Override
public void onClick(android.view.View v) {
    if (this.isValid()) {
        prefs.edit().putString(getString(R.string.username), usernameField.getText().toString()).commit();
        com.fuentesj.ttt.services.ChatService.getInstance().emitUser(usernameField.getText().toString(), this);
    }
}