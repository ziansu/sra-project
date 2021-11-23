@org.junit.Test
public void NullConstructorTest() {
    jumpingalien.part3.programs.SourceLocation source = new jumpingalien.part3.programs.SourceLocation(5, 6);
    jumpingalien.program.expression.Expression condition = new jumpingalien.program.expression.binary.LessThan(new jumpingalien.program.expression.unary.GetX(new jumpingalien.program.expression.Self(source), source), new jumpingalien.program.expression.DoubleConstant(200.0, source), source);
    try {
        new jumpingalien.program.statement.If(condition, null, null, source);
    } catch (java.lang.AssertionError error) {
        return ;
    }
    fail();
}