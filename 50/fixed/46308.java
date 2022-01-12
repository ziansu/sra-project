@org.junit.Test
public void testAcceleration() throws java.io.IOException {
    de.bmoth.parser.ast.nodes.MachineNode simpleMachineWithViolation = de.bmoth.parser.Parser.getMachineFileAsSemanticAst(((dir) + "AccMachine.mch"));
    de.bmoth.modelchecker.ModelCheckingResult result = de.bmoth.modelchecker.ModelChecker.doModelCheck(simpleMachineWithViolation);
    org.junit.Assert.assertEquals(false, result.isCorrect());
}