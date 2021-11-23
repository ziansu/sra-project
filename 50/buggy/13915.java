@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.button :
            break;
        case R.id.send :
            byte[] message = "this is a test".getBytes();
            mChatService.write(message);
            break;
    }
}