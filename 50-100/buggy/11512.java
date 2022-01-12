public datastructures.AttributeJoint getAttributesDFJoint() {
    datastructures.AttributeJoint attrJoint = new datastructures.AttributeJoint();
    for (dependency.ADependency df : this.df) {
        attrJoint.addAttributes(df.getAntecedent());
        attrJoint.addAttributes(df.getConsequent());
    }
    return attrJoint;
}