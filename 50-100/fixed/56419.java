@java.lang.Override
public void compute() {
    if ((!(f.isDefined())) || (!(input[1].isDefined()))) {
        outNum.setUndefined();
        return ;
    }
    java.lang.String limitString = f.getLimit(num.getDouble(), getDirection());
    if ((f) == null) {
        outNum.setUndefined();
        return ;
    }
    outNum.setUndefined();
    kernel.evaluateGeoGebraCASAsync(limitString, true, this, 0);
}