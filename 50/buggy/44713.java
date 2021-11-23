public act.util.ClassNode visitTree($.Function<act.util.ClassNode, ?> visitor) {
    visitSubTree(visitor);
    visitor.apply(this);
    return this;
}