@java.lang.Override
public void addChild(crane.topology.IComponent comp) {
    children.add(comp);
    comp.setParent(comp);
}