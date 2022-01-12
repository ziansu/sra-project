@java.lang.Override
public void run() {
    if ((((resultReceiver) != null) && ((msg) != null)) && (!(msg.isEmpty()))) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("socmsg", msg);
        resultReceiver.send(0, bundle);
    }
}