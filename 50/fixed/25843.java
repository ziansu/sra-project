@java.lang.Override
public void run() {
    mEvent.timestamp = time;
    mEvent.rawdata = bytes;
    notifyListeners();
    mEvent.rawdata = null;
}