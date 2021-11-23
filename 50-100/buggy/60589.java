@java.lang.Override
public void run() {
    try {
        request.resolve();
    } catch (java.lang.Exception resolutionException) {
        return ;
    }
    if ((request.getResolution()) == null) {
        return ;
    }
    if ((((candidate) != null) && ((candidate) instanceof fr.imag.adele.apam.Instance)) && ((request.getResolution()) != null)) {
        if (!(((fr.imag.adele.apam.Instance) (candidate)).isSharable()))
            reducePriorityDynamicRequest(request);
        
    }
}