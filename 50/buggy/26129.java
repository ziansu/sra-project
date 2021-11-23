public void notifyObservers(java.lang.String data) {
    for (group8.scam.controller.handlers.Observer observer : group8.scam.controller.handlers.Subject.observers) {
        java.lang.System.out.println(("IN OBS: " + data));
        observer.update(data);
    }
}