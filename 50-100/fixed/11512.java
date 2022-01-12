public datastructures.AttributeJoint getAttributesDFJoint() {
    datastructures.AttributeJoint attrJoint = new datastructures.AttributeJoint();
    for (dependency.ADependency obj : this.df) {
        attrJoint.addAttributes(obj.getAntecedent());
        attrJoint.addAttributes(obj.getConsequent());
    }
    return attrJoint;
}