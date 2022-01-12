@org.junit.Test
public void TestexecuteNonExistingVariable() {
    program = new jumpingalien.model.Program(new jumpingalien.program.statement.Skip(srceloc), variables);
    program.setStatementsLeft(5);
    jumpingalien.model.Shark shark = new jumpingalien.model.Shark(0, 0, sprites, program);
    assertEquals(assignement.execute(shark), ExecutionState.NOTDONE);
    try {
        program.getVariableValue("Test", Type.DOUBLE);
    } catch (java.lang.AssertionError error) {
        return ;
    }
    fail();
}