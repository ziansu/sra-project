@java.lang.Override
public void accept(au.net.hal9000.heisenberg.item.property.ItemVisitor visitor) {
    head.accept(visitor);
    if (null != (leftHand)) {
        leftHand.accept(visitor);
    }
    if (null != (rightHand)) {
        rightHand.accept(visitor);
    }
    core.accept(visitor);
    visitor.visit(this);
}