java.lang.Object _call(railo.runtime.PageContext pc, railo.runtime.type.Collection.Key key, railo.runtime.type.Struct namedArgs, java.lang.Object[] args, boolean superAccess) throws railo.runtime.exp.PageException {
    railo.runtime.component.Member member = getMember(pc, key, false, superAccess);
    if (member instanceof railo.runtime.type.UDF) {
        return _call(pc, ((railo.runtime.type.UDF) (member)), namedArgs, args);
    }
    return onMissingMethod(pc, (-1), member, key.getString(), args, namedArgs, superAccess);
}