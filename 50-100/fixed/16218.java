public void instrumentBeginAndEnd() {
    if ((!(this.isTestMethod)) || ((methodNode.instructions.size()) == 0))
        return ;
    
    methodNode.instructions.insert(org.scova.instrumenter.CodeGeneration.generateBeginTestCode(org.scova.instrumenter.CodeGeneration.prepareFullyQualifiedName(className, this.getMethodName())));
    methodNode.instructions.insert(lastStatement, org.scova.instrumenter.CodeGeneration.generateEndTestCode(org.scova.instrumenter.CodeGeneration.prepareFullyQualifiedName(className, this.getMethodName())));
}