public boolean isOperator(java.lang.String opName) {
    for (model.CafeOperator op : getOps()) {
        if (op.getName().equals(opName)) {
            return true;
        }
    }
    return false;
}