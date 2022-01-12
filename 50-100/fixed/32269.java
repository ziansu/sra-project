@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    ClassDetails.theBooking = bookingList.get(position);
    android.content.Intent i = new android.content.Intent(getBaseContext(), team2beat.com.qrcodes.ClassDetails.class);
    this.startActivity(i);
}