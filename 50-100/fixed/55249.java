public static void init(kaufland.com.snackbarlibrary.SnackbarConfiguration snackbarConfiguration) {
    if (snackbarConfiguration == null) {
        return ;
    }
    kaufland.com.snackbarlibrary.SnackbarManager.sSnackbar = new kaufland.com.snackbarlibrary.Snackbar(snackbarConfiguration);
    if (snackbarConfiguration.getSnackbarType().equals(SnackbarConfiguration.SnackbarType.SINGLE_SNACKBAR)) {
        kaufland.com.snackbarlibrary.SnackbarManager.sSemaphore = new java.util.concurrent.Semaphore(1);
    }else {
        kaufland.com.snackbarlibrary.SnackbarManager.sSemaphore = new java.util.concurrent.Semaphore(java.lang.Runtime.getRuntime().availableProcessors());
    }
}