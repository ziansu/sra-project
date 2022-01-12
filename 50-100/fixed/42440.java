@java.lang.Override
public final void setChildren(final edu.washington.escience.myria.operator.Operator[] children) {
    java.lang.Integer opId = getOpId();
    com.google.common.base.Preconditions.checkArgument(((child) == null), "Operator opid=%s called setChildren(), but children have already been set", opId);
    com.google.common.base.Preconditions.checkNotNull(children, "Unary operator opId=%s has null children", opId);
    com.google.common.base.Preconditions.checkArgument(((children.length) == 1), "Operator opId=%s setChildren() must be called with an array of length 1", opId);
    com.google.common.base.Preconditions.checkNotNull(children[0], "Unary operator opId=%s has its child to be null", opId);
    child = children[0];
}