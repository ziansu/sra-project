private apps.ExecID genExecID(quickfix.fix42.NewOrderSingle order) throws apps.FieldNotFound {
    int ret = this.execId;
    (this.execId)++;
    return new apps.ExecID(((order.getClOrdID().getValue()) + (java.lang.String.valueOf(ret))));
}