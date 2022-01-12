@java.lang.Override
public java.lang.String[] assemble(java.lang.String[] parts, java.util.HashMap<java.lang.String, java.lang.Integer> symbolTable, int pc, java.io.PrintStream error, int lineno) {
    java.lang.String[] ans = new java.lang.String[3];
    java.lang.Integer address = symbolTable.get(parts[1]);
    ans[0] = "" + 13;
    pc++;
    ans[1] = parts[1];
    pc++;
    ans[2] = "" + 0;
    pc++;
    return ans;
}