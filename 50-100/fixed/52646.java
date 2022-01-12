@java.lang.Override
public com.avos.avoscloud.ops.AVOp merge(com.avos.avoscloud.ops.AVOp other) {
    assertKeyEquals(other);
    switch (other.type()) {
        case Compound :
            other.cast(com.avos.avoscloud.ops.CompoundOp.class).addFirst(this);
            return other;
        case Set :
        case Add :
        case AddUnique :
        case AddRelation :
        case Increment :
            return other;
        case Remove :
        case RemoveRelation :
        case Null :
        case Delete :
            return this;
        default :
            throw new java.lang.IllegalStateException(("Unknow op type " + (other.type())));
    }
}