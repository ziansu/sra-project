@java.lang.Override
public void report(java.lang.Class fromClass, java.lang.String reason, java.lang.String exceptionMessage) {
    if ((com.musenkishi.wally.base.WallyApplication.getDataProviderInstance().getSharedPreferencesDataProviderInstance().hasUserApprovedCrashLogging()) == (com.musenkishi.wally.dataprovider.SharedPreferencesDataProvider.CRASH_LOGGING_APPROVED)) {
        java.lang.String message = (((("Class: " + (fromClass.getName())) + ", reason: ") + reason) + ", exceptionMessage: ") + exceptionMessage;
        com.crashlytics.android.Crashlytics.log(message);
    }
}