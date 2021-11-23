@java.lang.Override
public void visit(IC.CodeGeneration.LabelInstr instr) {
    java.lang.String labelName = instr.label.name;
    boolean isMethodLabel = assemblyMethods.keySet().contains(labelName);
    if (isMethodLabel) {
        currentMethod = labelName;
        dropLine();
        addAssemblyComment("-------------------");
        addAssemblyLine(".align 4");
    }
    addAssemblyLine(instr.toString());
    if (isMethodLabel)
        generatePrologueStatements(currentMethod);
    
    dropLine();
}