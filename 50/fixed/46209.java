@java.lang.Override
public void onFilterComplete(int count) {
    listener.onFilterDone(count);
    updateRoomsDisplay(count);
}