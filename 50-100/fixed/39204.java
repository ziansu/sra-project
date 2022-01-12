public void addService(pt.ua.tm.neji.web.services.Service service, java.io.InputStream logo, java.io.InputStream fp) throws pt.ua.tm.neji.exception.NejiException {
    validateService(service, logo, fp, true);
    try {
        db.addService(service);
    } catch (pt.ua.tm.neji.exception.NejiException ex) {
        throw new pt.ua.tm.neji.exception.NejiException(("There was a problem adding the service.\n" + "Please try again later."), ex);
    }
}