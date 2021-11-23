@java.lang.Override
public void run() {
    new pt.castro.tops.communication.EndpointSearch().execute(query);
    pt.castro.tops.CustomApplication.getPlacesManager().clear();
    searchThread = null;
}