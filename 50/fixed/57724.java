@java.lang.Override
public void onSeatPressed(com.github.ykrapiva.eventmap.Figure seat) {
    switch (seat.getState()) {
        case AVAILABLE :
            seat.setState(Figure.State.PRESSED);
            break;
    }
    mEventMapView.updateSeatColor(seat);
}