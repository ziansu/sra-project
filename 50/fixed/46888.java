private ValueTy getValueFor(NodeTy node) {
    ValueTy val = values.get(node);
    if (val == null) {
        val = lattice.getBottom();
        values.put(node, val);
    }
    return val;
}