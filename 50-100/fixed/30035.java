@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(v.getContext(), "Cliccato sulla cardView", Toast.LENGTH_LONG).show();
    android.content.Intent i = new android.content.Intent(v.getContext(), it.polito.mad.insane.lab2.ViewBooking.class);
    i.putExtra("Booking", this.currentBooking);
    v.getContext().startActivity(i);
}