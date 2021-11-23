public java.util.List<org.iish.hsn.invoer.service.Relatie> findMatchingRelaties(java.lang.String relatie, java.lang.Integer relkode) {
    if (relkode != null) {
        return java.util.Arrays.asList(relatieRepository.findByRelkode(relkode));
    }
    return relatieRepository.findByRelatieLike(((relatie.trim()) + "%"), WorkOrder.EMPTY_WORKORDER, inputMetadata.getWorkOrder());
}