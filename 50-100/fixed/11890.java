private void CheckInfiniteLoop(nez.lang.Expression e, java.lang.String var) {
    if (!(consumption.isConsumed(e))) {
        If(var, _Eq(), _Field(_state(), "pos"));
        {
            Break();
        }
        EndIf();
    }
}