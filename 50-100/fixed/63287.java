private void parseReturnAddress(java.util.List<ActivationRecord> stack, java.lang.String[] parameters) throws java.lang.Exception {
    for (ActivationRecord ar : stack) {
        if (ar.function.equals(parameters[0])) {
            ar.returnAddress = parameters[1];
            return ;
        }
    }
}