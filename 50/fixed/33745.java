@java.lang.Override
public void callback(java.util.ArrayList<cl.smartcities.isci.transportinspector.backend.Event> response) {
    updateElementById(response, null, getBusId());
}