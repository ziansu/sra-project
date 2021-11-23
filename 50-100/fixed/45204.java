@java.lang.Override
public void response(byte[] msg) {
    program.add(msg[0]);
    program.add(msg[1]);
    android.util.Log.w("LOLZ", java.lang.Integer.toHexString(msg[0]));
    android.util.Log.w("LOLZ", java.lang.Integer.toHexString(msg[1]));
    if (current == (programSize - 1)) {
        callback.response(program);
    }
}