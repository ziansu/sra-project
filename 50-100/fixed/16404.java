public static void cancel(java.lang.Long id2) {
    if (id2 == null)
        throw new java.lang.IllegalArgumentException("The id argument is required");
    
    org.apache.commons.logging.LogFactory.getLog(freedays.domain.Request.class.getClass()).info(("Cancelation attempt!" + id2));
    freedays.domain.Request req = freedays.domain.Request.findRequest(id2);
    req.cancel();
    req.persist();
}