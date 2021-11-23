@java.lang.Override
public void onFilterComplete(int count) {
    updateRoomsDisplay(count);
    listener.onFilterDone(count);
}