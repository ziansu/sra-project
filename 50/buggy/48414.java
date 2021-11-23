@java.lang.Override
public java.util.Collection<? extends model.Position> tickToRemove() {
    java.util.Set<model.Position> toRemove = new java.util.HashSet<>();
    toRemove.add(position);
    return toRemove;
}