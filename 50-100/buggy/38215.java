private static org.jill.openjill.core.api.entities.BackgroundEntity checkObjectHitBlockUp(final int startX, final int endX, final int startY, final int endY, final org.jill.openjill.core.api.entities.BackgroundEntity[][] backgroundObject) {
    return org.jill.game.entities.obj.util.UtilityObjectEntity.checkObjectHitBlockOrStair(startX, endX, endY, startY, backgroundObject, false, true, false);
}