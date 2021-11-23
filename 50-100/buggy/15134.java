public boolean equals(java.lang.Object obj) {
    if (obj == (this)) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (obj instanceof mc.compiler.ast.RangeNode) {
        mc.compiler.ast.RangeNode node = ((mc.compiler.ast.RangeNode) (obj));
        if ((start) != (node.getStart())) {
            return false;
        }
        if ((end) == (node.getEnd())) {
            return false;
        }
        return true;
    }
    return false;
}