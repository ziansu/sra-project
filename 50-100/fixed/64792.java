@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_room_reservation);
    android.content.Intent i = getIntent();
    java.lang.String roomData = i.getStringExtra("roomData");
    java.lang.System.out.println(roomData);
    roomDataTextView = ((android.widget.TextView) (findViewById(R.id.tv_room)));
    roomDataTextView.setText(roomData);
}