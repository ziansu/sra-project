@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        items = com.example.coopsysapp.ServerConnector.getNameList();
        java.lang.Thread.sleep(500);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (com.example.coopsysapp.exception.FunctionNotDefinedException e) {
        e.printStackTrace();
    }
    return null;
}