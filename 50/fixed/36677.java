private void moveToTarget() {
    moveTo(target.getTarget(), target.getWorld(), target.getTurn());
    target = null;
}