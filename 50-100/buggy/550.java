public boolean isContained(datastructures.AttributeJoint attrJoint) {
    if ((attrJoint.getAttributeJoint()) == null)
        return false;
    
    for (datastructures.Attribute attr : attrJoint.getAttributeJoint())
        if (attr.equals(this))
            return true;
        
    
    return false;
}