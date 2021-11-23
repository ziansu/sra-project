@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (com.parse.ParseCrashReporting.isCrashReportingEnabled()) {
        populateCampaignsParse();
    }
}