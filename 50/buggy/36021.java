public void run() {
    for (nl.tue.id.oocsi.server.services.AbstractService service : services) {
        service.start();
    }
}