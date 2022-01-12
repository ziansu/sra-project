@java.lang.Override
public void onClick(android.view.View v) {
    waveSignUpTask.execute(app.android.box.waveprotocol.org.androidwave.util.Util.getHostAndUserNames(username.getText().toString())[1], app.android.box.waveprotocol.org.androidwave.util.Util.getHostAndUserNames(username.getText().toString())[0], password.getText().toString());
}