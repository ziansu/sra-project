public static void main(java.lang.String[] args) throws java.io.IOException {
    java.lang.String fileName = args[0];
    java.lang.System.out.println("================================");
    java.lang.System.out.println("            WARNINGS            ");
    java.lang.System.out.println("================================\n");
    Driver.findUnusedVariables(fileName);
    Driver.findOneLineIfElse(fileName);
    Driver.findUndeclaredFuncts(fileName);
    if (!(Context.findBracketBalance(fileName))) {
    }else
        java.lang.System.out.println("Brackets balanced");
    
}