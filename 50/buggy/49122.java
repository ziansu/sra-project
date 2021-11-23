@java.lang.Override
public cz.vutbr.fit.xproko26.pivis.model.expressions.ConcretizeExpression copy(cz.vutbr.fit.xproko26.pivis.model.expressions.Expression par) {
    cz.vutbr.fit.xproko26.pivis.model.expressions.ConcretizeExpression copy = new cz.vutbr.fit.xproko26.pivis.model.expressions.ConcretizeExpression(par);
    copy.id = id;
    copy.args = args.copy();
    copy.setSuccExp(null);
    return copy;
}