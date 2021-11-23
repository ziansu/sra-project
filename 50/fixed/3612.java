@java.lang.Override
public void handleRequest(io.stallion.requests.StRequest request, io.stallion.requests.StResponse response) {
    io.stallion.monitoring.HealthTracker.instance().logResponse(request, response);
}