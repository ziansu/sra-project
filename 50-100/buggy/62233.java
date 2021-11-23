@java.lang.Override
public java.lang.String toString() {
    if (((this.joint) == null) || ((this.joint.size()) == 0))
        return "null";
    
    java.lang.String stringJoint = "{" + (joint.get(0).toString());
    for (int i = 1; i < (joint.size()); i++)
        stringJoint = (stringJoint + ", ") + (joint.get(i).toString());
    
    return stringJoint + "}";
}