@jcstress.Arbiter
public void arbiter(jcstress.RaceCondition.MyState state, org.openjdk.jcstress.infra.results.BooleanResult2 result) {
    result.r1 = (state.counter.count) == 5;
    result.r2 = (state.counter.count) != 5;
}