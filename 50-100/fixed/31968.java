public void setX(java.lang.Integer x) {
    logger.info(parent);
    if (((this.parent) != null) && ((x + (this.width)) > ((parent.getX()) + (parent.getWidth())))) {
        com.xhub.pdflego.exception.ComponentOverflowException e = new com.xhub.pdflego.exception.ComponentOverflowException();
        this.logger.error(e.getMessage(), e);
    }
    this.x = x;
}