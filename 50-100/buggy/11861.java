@java.lang.Override
public org.apache.drill.common.expression.PathSegment.ArraySegment cloneWithNewChild(org.apache.drill.common.expression.PathSegment newChild) {
    org.apache.drill.common.expression.PathSegment.ArraySegment seg = new org.apache.drill.common.expression.PathSegment.ArraySegment(index);
    if ((child) != null) {
        seg.setChild(child.cloneWithNewChild(newChild));
    }else {
        seg.setChild(newChild);
    }
    return seg;
}