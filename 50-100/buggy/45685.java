@java.lang.Override
public void accept(au.net.hal9000.heisenberg.item.property.ItemVisitor visitor) {
    visitor.visit(head);
    if (null != (leftHand)) {
        visitor.visit(leftHand);
    }
    if (null != (rightHand)) {
        visitor.visit(rightHand);
    }
    visitor.visit(core);
}