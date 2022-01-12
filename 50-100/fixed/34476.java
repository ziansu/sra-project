private boolean checkInstances(java.util.List<src.problem.components.IField> fields) {
    for (src.problem.components.IField f : fields) {
        if (f.getType().contains(this.name)) {
            if (f.getVisibility().equals("private")) {
                return true;
            }
        }
    }
    return false;
}