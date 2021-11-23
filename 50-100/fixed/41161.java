protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_received);
    listView = ((android.widget.ListView) (findViewById(R.id.receivedphotos)));
    java.lang.String[] values = new java.lang.String[]{ "|Physics| Received: July 3" , "|Math| Received: July 2" , "|Math| Received: July 2" , "|English| Received July 1" , "|Physics| Received: June 30" , "|Math| Received: June 15" , "|Math| Received: June 2" , "|Economics| Received June 1" , "|Physics| Received: May 30" , "|Math| Received: May 29" , "|Math| Received: May 26" , "|Math| Received May 15" };
    android.widget.ArrayAdapter<java.lang.String> adapter;
}