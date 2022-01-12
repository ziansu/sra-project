public void apply(int frame) {
    com.jme3.math.Transform targetTransform = ((targetOMA) != null) ? constraintHelper.getTransform(targetOMA, subtargetName, targetSpace) : null;
    constraintDefinition.bake(ownerSpace, targetSpace, targetTransform, ipo.calculateValue(frame));
}