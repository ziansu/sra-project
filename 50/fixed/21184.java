public java.lang.String run() {
    try {
        io.spacedog.client.SpaceRequest.post("/1/snapshot").superdogAuth().go(202);
    } catch (java.lang.Throwable t) {
        return io.spacedog.admin.AdminJobs.error(this, t);
    }
    return "OK";
}