@org.junit.Test
public void testAddEmptyValueToEmptySet() {
    ar.fiuba.tdd.tp.model.rule.LineContinuityRule contRule = new ar.fiuba.tdd.tp.model.rule.LineContinuityRule(2);
    java.util.ArrayList<ar.fiuba.tdd.tp.model.cell.PositionValueDuo> values = new java.util.ArrayList<>();
    values.add(new ar.fiuba.tdd.tp.model.cell.PositionValueDuo(new ar.fiuba.tdd.tp.model.cell.Value(0), new ar.fiuba.tdd.tp.model.cell.Position(0, 0)));
    ar.fiuba.tdd.tp.model.cell.PositionValueDuo value = new ar.fiuba.tdd.tp.model.cell.PositionValueDuo(new ar.fiuba.tdd.tp.model.cell.Value(0), new ar.fiuba.tdd.tp.model.cell.Position(0, 0));
    assertTrue(contRule.check(values, value));
}