@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.opendata.myparking.parkingapp.database.DBOpenHelper db = new com.opendata.myparking.parkingapp.database.DBOpenHelper(getActivity().getApplicationContext());
}