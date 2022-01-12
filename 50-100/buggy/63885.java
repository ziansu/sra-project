private boolean isTouchedInZone(android.view.MotionEvent event, com.ne4istb.matchgame.Zone zone) {
    return ((((event.getX()) > (zone.getLeft())) && ((event.getX()) < (zone.getRight()))) && ((event.getY()) > (zone.getTop()))) && ((event.getY()) < (zone.getBottom()));
}