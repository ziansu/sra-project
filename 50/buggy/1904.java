public boolean checkIfExists(java.lang.String id) {
    try {
        models.Worker worker = new models.Worker(id);
        return true;
    } catch (impres.exception.InvalidPrimaryKeyException ex) {
        java.lang.System.out.println(ex.getMessage());
        return false;
    }
}