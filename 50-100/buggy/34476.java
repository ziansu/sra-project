private boolean checkInstances(java.util.List<src.problem.components.IField> fields) {
    for (src.problem.components.IField f : fields) {
        if (f.getType().equals(this.name)) {
            if (f.getVisibility().equals("private")) {
                for (java.lang.String s : f.getModifiers()) {
                    if (s.equals("static")) {
                        return true;
                    }
                }
            }
        }
    }
    return false;
}