public void addVariable(java.lang.String name, int size) {
    if ((size <= 0) || (size > 32))
        throw new java.lang.IllegalArgumentException("Illegal variable size");
    
    if ((getVariable(name)) >= 0)
        throw new java.lang.IllegalArgumentException("Duplicated variable");
    
    variables = org.mmaroti.ua.csp.Problem.append(variables, new org.mmaroti.ua.csp.Variable(name));
    values = org.mmaroti.ua.csp.Problem.append(values, (size < 32 ? (1 << size) - 1 : -1));
}