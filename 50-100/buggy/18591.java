protected boolean canBindOneToOneWithSingleColumnAndForeignKey(org.grails.orm.hibernate.cfg.Association currentGrailsProp) {
    if (currentGrailsProp.isBidirectional()) {
        final org.grails.orm.hibernate.cfg.Association otherSide = currentGrailsProp.getInverseSide();
        if (isHasOne(otherSide))
            return false;
        
        if ((!(currentGrailsProp.isOwningSide())) && (otherSide.isOwningSide())) {
            return true;
        }
    }
    return false;
}