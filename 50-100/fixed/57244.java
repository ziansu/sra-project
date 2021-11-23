public burlap.oomdp.core.Value replaceRelationalTarget(java.lang.String target) {
    java.util.TreeSet<java.lang.String> newTargetObjects = new java.util.TreeSet<java.lang.String>(this.targetObjects);
    newTargetObjects.remove(target);
    return new burlap.oomdp.core.values.MultiTargetRelationalValue(this.attribute, newTargetObjects, this.hashTuple.getHashFactory());
}