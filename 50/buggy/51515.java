public void buttonAuth(android.view.View view) {
    ((com.example.brewchat.Application) (getApplication())).getChatService().login(username.getText().toString(), password.getText().toString());
}