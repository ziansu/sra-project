public java.lang.Object getChildData(bento.runtime.NameNode name) {
    bento.runtime.Definition parentDef = def;
    bento.runtime.ArgumentList args = getArguments();
    int n = name.numParts();
    try {
        if (n == 1) {
            return parentDef.getChildData(name, null, context, args);
        }else {
            return parentDef.getChild(name, name.getArguments(), name.getIndexes(), args, context, true, true, this, null);
        }
    } catch (bento.runtime.Redirection r) {
        return null;
    }
}