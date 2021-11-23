public static java.lang.Runnable getCustomAskRunnable(java.lang.String message, java.lang.String[] buttons, int[] values, int defaultChoice, boolean global, net.rim.device.api.script.ScriptableFunction callback) {
    net.rim.device.api.ui.component.Dialog d = new net.rim.device.api.ui.component.Dialog(message, buttons, values, defaultChoice, null, (global ? net.rim.device.api.ui.component.Dialog.GLOBAL_STATUS : 0));
    return new blackberry.ui.dialog.DialogRunnableFactory.DialogAsyncRunnable(d, callback);
}