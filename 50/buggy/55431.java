@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if (handler.connectToServer()) {
        java.lang.System.out.println("Connessione riuscita");
        handler.bindToBroadcastQueue();
    }else {
        java.lang.System.out.println("Connessione non riuscita");
    }
    return null;
}