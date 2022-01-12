@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle bundle = intent.getExtras();
    if (bundle != null) {
        com.example.mappingservice.Result result = bundle.getParcelable(MappingService.RESULT);
        tv.setText(result.getVenue(0).getAddress());
    }else {
        tv.setText("Bundle is null");
    }
}