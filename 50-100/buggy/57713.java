@org.snapscript.core.Bug(value = "what do we do to figure out type")
public java.lang.Object create(org.snapscript.core.Scope scope, java.lang.Object left, java.lang.String name) throws java.lang.Exception {
    if (left != null) {
        org.snapscript.core.Module module = scope.getModule();
        org.snapscript.core.Context context = module.getContext();
        org.snapscript.core.TypeExtractor extractor = context.getExtractor();
        org.snapscript.core.Type type = extractor.getType(left, true);
        if (type != null) {
            return new org.snapscript.core.ValueKey(name, type);
        }
    }
    return name;
}