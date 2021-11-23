private boolean isMaxAllowedSpaceInUse() {
    int size = ((java.lang.Double) (getDBStats().get("dataSize"))).intValue();
    return size >= (org.twi.imageshare.repositories.ImageTemplateRepository.MAX_ALLOWED_DB_SIZE);
}