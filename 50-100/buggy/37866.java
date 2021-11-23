private void killMobile(final contract.IMotionElement motionElement, final contract.ILorannWorld lorannWorld) {
    if (lorannWorld.removeMobile(motionElement.getX(), motionElement.getY())) {
        motionElement.setX(lorannWorld.getLorann().getX());
        motionElement.setY(lorannWorld.getLorann().getY());
    }
}