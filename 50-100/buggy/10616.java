protected java.lang.Object invoke(java.lang.Object args) throws java.lang.Exception {
    java.lang.String[] argdata = ((java.lang.String[]) (args));
    int arg1 = java.lang.Integer.valueOf(argdata[0]);
    int arg2 = java.lang.Integer.valueOf(argdata[1]);
    int arg3 = java.lang.Integer.valueOf(argdata[2]);
    return source.CalculateSalary.calculateSalary(arg1, arg2, arg3);
}