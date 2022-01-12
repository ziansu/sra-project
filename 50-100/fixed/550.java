public boolean isContained(datastructures.AttributeJoint attrJoint) {
    if ((attrJoint.getAttributeJoint()) == null)
        return false;
    
    for (datastructures.Attribute obj : attrJoint.getAttributeJoint())
        if (obj.equals(this))
            return true;
        
    
    return false;
}