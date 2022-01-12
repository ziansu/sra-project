@org.junit.Test
public void SetGetVariableValueWrongVariableTest() {
    empty_variables.put("number", Type.DOUBLE);
    jumpingalien.program.statement.Skip skip = new jumpingalien.program.statement.Skip(source);
    jumpingalien.model.Program program = new jumpingalien.model.Program(skip, empty_variables);
    try {
        program.getVariableValue("notnumber", Type.DOUBLE);
        fail();
    } catch (java.lang.AssertionError error1) {
        try {
            program.getVariableValue("number", Type.BOOL);
            fail();
        } catch (java.lang.AssertionError error2) {
            return ;
        }
    }
}