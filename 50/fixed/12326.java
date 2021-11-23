@java.lang.Override
public cn.wensiqun.asmsupport.client.def.param.ObjectParam assign(cn.wensiqun.asmsupport.client.def.var.Var var) {
    return new cn.wensiqun.asmsupport.client.def.param.ObjectParam(cursor, cn.wensiqun.asmsupport.client.def.ParamPostern.getTarget(new cn.wensiqun.asmsupport.client.def.action.AssignAction(cursor, var).doAction(this)));
}