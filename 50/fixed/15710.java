@java.lang.Override
public void accept(au.net.hal9000.heisenberg.item.property.ItemVisitor visitor) {
    for (au.net.hal9000.heisenberg.item.api.Item item : getContents()) {
        item.accept(visitor);
    }
    visitor.visit(this);
}