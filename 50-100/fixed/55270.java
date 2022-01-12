@java.lang.Override
public void onClick(android.view.View v) {
    isConnected = false;
    if (!(isConnected)) {
        java.lang.Runnable checkInternet = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                onCheckInternetConnection(softwareengineering.assignment.sharify.LoginActivity.this);
            }
        };
        new java.lang.Thread(checkInternet).start();
    }
    login();
}