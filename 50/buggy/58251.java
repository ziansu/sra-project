@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((mTransactionns.size()) != 0)
        sendUpdate();
    
}