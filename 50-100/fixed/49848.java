private boolean checkMethods(java.util.List<src.problem.components.IMethod> methods) {
    for (src.problem.components.IMethod m : methods) {
        if (m.getReturnType().contains(this.name)) {
            if (m.getVisibility().equals("public")) {
                for (java.lang.String s : m.getModifiers()) {
                    if (s.equals("static")) {
                        return true;
                    }
                }
            }
        }
    }
    return false;
}