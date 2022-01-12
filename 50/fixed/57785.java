@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if (((hyjjr.cs160.com.safe_radius.Global) (getApplication())).isTurnedOn()) {
        startRequestLocation2();
    }
}