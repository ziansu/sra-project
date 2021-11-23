@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FlightNoEnter = ((android.widget.EditText) (findViewById(R.id.FlNoEnter)));
    DateEnter = ((android.widget.EditText) (findViewById(R.id.FlightDateEnter)));
    setContentView(R.layout.activity_input_flights);
}