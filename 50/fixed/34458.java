public boolean isOperator(java.lang.String opName) {
    for (model.CafeOperator op : getOps()) {
        if (op.getName().trim().equals(opName.trim())) {
            return true;
        }
    }
    return false;
}