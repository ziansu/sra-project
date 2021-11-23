public void updateInputs() {
    inputs.clear();
    inputs.add(x);
    inputs.add(y);
    inputs.add(rotation);
    closestTarget = findNearestTarget();
    inputs.add(((double) (closestTarget.getX())));
    inputs.add(((double) (closestTarget.getY())));
}