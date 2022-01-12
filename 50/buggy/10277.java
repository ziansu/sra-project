@java.lang.Override
public void newClient(Airport.Client client) {
    Log.CCR.info(("Nouveau CCR connect� depuis " + (client.getDNS())));
}