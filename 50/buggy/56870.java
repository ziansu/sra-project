private boolean isMaxAllowedSpaceInUse() {
    int size = ((java.lang.Integer) (getDBStats().get("dataSize")));
    return size >= (org.twi.imageshare.repositories.ImageTemplateRepository.MAX_ALLOWED_DB_SIZE);
}