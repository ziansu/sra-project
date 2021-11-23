private void accessMember(de.lathanda.eos.interpreter.Environment env) {
    type = target.getType();
    target.resolveNamesAndTypes(target, env);
    methodType = type.getAssignProperty(member);
    isVariable = false;
    if ((methodType) == null) {
        env.addError(marker, "UnknownMember", (((type) + ".") + (member)));
        type = de.lathanda.eos.interpreter.Type.getUnknown();
    }else {
        type = methodType.getParameterType(0);
    }
}