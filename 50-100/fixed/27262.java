@java.lang.Override
public prompto.type.IteratorType check(prompto.runtime.Context context) throws prompto.error.SyntaxError {
    prompto.type.IType paramType = source.check(context).checkIterator(context);
    prompto.runtime.Context child = context.newChildContext();
    child.registerValue(new prompto.runtime.Variable(name, paramType));
    prompto.type.IType resultType = expression.check(child);
    return new prompto.type.IteratorType(resultType);
}