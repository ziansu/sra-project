private java.lang.Object[] convertToCorrectType(java.util.List<java.lang.String> instr) {
    java.util.List<java.lang.Integer> intParameters = new java.util.LinkedList<java.lang.Integer>();
    instr.remove(0);
    if (arguments.contains("-s"));
    instr.forEach(( instrString) -> intParameters.add(java.lang.Integer.parseInt(instrString)));
    return intParameters.toArray();
}