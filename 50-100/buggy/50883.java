@java.lang.Override
public boolean onSeatClicked(com.github.ykrapiva.eventmap.Figure seat) {
    switch (seat.getState()) {
        case SELECTED :
            seat.resetState();
            break;
        case AVAILABLE :
        case PRESSED :
            seat.setState(Figure.State.SELECTED);
            break;
        case NOT_AVAILABLE :
            break;
    }
    mEventMapView.updateSeatColor(seat);
    return true;
}