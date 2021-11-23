private void parseReturnAddress(java.util.List<ActivationRecord> stack, java.lang.String[] parameters) throws java.lang.Exception {
    for (ActivationRecord ar : stack) {
        if (ar.function.equals(parameters[0])) {
            ar.returnAddress = java.lang.Long.parseUnsignedLong(parameters[1].substring(2), 16);
            return ;
        }
    }
}