@java.lang.Override
public me.okx.neim.stack.NStack dyad(me.okx.neim.var.VarInteger a, me.okx.neim.var.VarInteger b) {
    me.okx.neim.var.VarInteger val = a.modulo(b);
    return new me.okx.neim.stack.NStackBuilder(val).build();
}