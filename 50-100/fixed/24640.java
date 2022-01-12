public void updateInputs() {
    inputs.clear();
    inputs.add(rotation);
    closestTarget = findNearestTarget();
    inputs.add((((double) (closestTarget.getX())) - (x)));
    inputs.add((((double) (closestTarget.getY())) - (y)));
}