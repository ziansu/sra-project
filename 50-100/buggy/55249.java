public static void init(android.content.Context applicationContext, kaufland.com.snackbarlibrary.SnackbarConfiguration snackbarConfiguration) {
    if ((applicationContext == null) || (snackbarConfiguration == null)) {
        return ;
    }
    kaufland.com.snackbarlibrary.SnackbarManager.sSnackbar = new kaufland.com.snackbarlibrary.Snackbar(applicationContext, snackbarConfiguration);
    if (snackbarConfiguration.getSnackbarType().equals(SnackbarConfiguration.SnackbarType.SINGLE_SNACKBAR)) {
        kaufland.com.snackbarlibrary.SnackbarManager.sSemaphore = new java.util.concurrent.Semaphore(1);
    }else {
        kaufland.com.snackbarlibrary.SnackbarManager.sSemaphore = new java.util.concurrent.Semaphore(java.lang.Runtime.getRuntime().availableProcessors());
    }
}