@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.book_trip :
            if ((bus) != null) {
                if ((bus.getRemaining_seats()) != "0") {
                    bookTrip();
                }
            }
            break;
        case R.id.btnCancelBooking :
            cancelTrip();
            break;
    }
}