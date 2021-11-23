@java.lang.Override
public void accept(au.net.hal9000.heisenberg.item.property.ItemVisitor visitor) {
    for (au.net.hal9000.heisenberg.item.api.Item item : getContents()) {
        visitor.visit(item);
    }
    super.accept(visitor);
}