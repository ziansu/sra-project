protected void inContact(java.util.HashSet<Block> blocks) {
    boolean hasContact = false;
    for (Block block : blocks) {
        if (((this) != block) && (this.intersects(block))) {
            hasContact = true;
            this.setColor(java.awt.Color.BLUE);
            java.awt.Rectangle intersectionBlock = ((java.awt.Rectangle) (this.intersection(block)));
            intersectionCoverage(intersectionBlock);
        }
    }
    if (!hasContact) {
        this.setColor(java.awt.Color.BLACK);
    }
}