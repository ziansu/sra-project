@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        filePath = getArguments().getString(com.digzdigital.hebronradio.fragment.ScheduleDetails.ARG_PARAM1);
    }
}