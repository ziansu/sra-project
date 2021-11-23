public void run() {
    byte[] buffer = new byte[1024];
    int bytes;
    while (true) {
        try {
            bytes = mmInStream.read(buffer);
            onUpdate.OnUpdate(new app.arbiterlab.ticandroid.library.datas.Update(connectionContext, app.arbiterlab.ticandroid.library.libs.Constants.RESULT_MESSAGE, true, bytes, buffer));
        } catch (java.io.IOException e) {
            break;
        }
    } 
}