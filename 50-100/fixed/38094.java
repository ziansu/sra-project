@java.lang.Override
public void run() {
    com.assuredlabor.cordova.hockeyapp.JSException e = new com.assuredlabor.cordova.hockeyapp.JSException(message);
    net.hockeyapp.android.ExceptionHandler.saveException(e, new net.hockeyapp.android.CrashManagerListener() {
        public java.lang.String getDescription() {
            java.lang.String description = message;
            if (data != null) {
                description = (description + ", Data: ") + (data.toString());
            }
            return description;
        }
    });
}