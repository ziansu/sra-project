private org.openbaton.catalogue.nfvo.VimInstance getVimInstance(org.openbaton.sdk.NFVORequestor requestor, java.lang.String vim_id) {
    org.openbaton.catalogue.nfvo.VimInstance v = null;
    try {
        logger.debug(requestor.getVimInstanceAgent().findAll().toString());
        v = requestor.getVimInstanceAgent().findById(vim_id);
    } catch (java.lang.Exception e) {
        logger.error("Exception while creating credentials");
        logger.error(e.getMessage());
        logger.error(e.toString());
        e.printStackTrace();
    }
    return v;
}