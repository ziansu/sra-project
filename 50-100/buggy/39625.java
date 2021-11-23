public void Retrace(Tiler.Objects.Square ENDPOINT) {
    Tiler.Objects.Square Current = ENDPOINT;
    ENDPOINT.setTracing();
    java.lang.System.out.println("Retrace Started");
    while (Current.hasParent()) {
        Current.setTracing();
        Current.getParent().setTracing();
        Current = Current.getParent();
    } 
    java.lang.System.out.println("Stopped");
}