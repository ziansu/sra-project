@org.junit.Test
public void typeofEmptyArrayLiteralAssignment() {
    this.testTypeofEmptyArrayLiteralAssignment("Boolean[] a\na := { }\n", edu.kit.iti.formal.pse.worthwhile.model.ast.BooleanType.class);
}