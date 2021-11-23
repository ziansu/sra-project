public org.mindswap.owls.service.Service readService(java.lang.String serviceURI) {
    org.mindswap.owls.service.Service service = null;
    if ((edu.utep.trustlab.repository.Repository.getRepository()) != null)
        serviceURI = edu.utep.trustlab.visko.util.RedirectURI.redirectHack(serviceURI, edu.utep.trustlab.repository.Repository.getRepository().getBaseURL());
    
    java.net.URI uri = edu.utep.trustlab.visko.util.GetURLContents.getURI(serviceURI);
    try {
        service = kb.readService(uri);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return service;
}