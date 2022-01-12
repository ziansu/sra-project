public static ramd.RamdRequestHandler handler() throws java.lang.Exception {
    if ((ramd.StatusAPI.__handler) == null) {
        synchronized(ramd.StatusAPI.class) {
            if ((ramd.StatusAPI.__handler) == null)
                ramd.StatusAPI.__handler = ramd.RamdRequestHandler.build("Status", "Get current system status of this Ramd node", ramd.StatusAPI.class, "getStatus", new java.lang.Class[]{ ramd.RamdRequest.class });
            
        }
    }
    return ramd.StatusAPI.__handler;
}