private static void mergeTypeToSubRef(java.lang.String type, com.googlecode.dex2jar.ir.ts.TypeTransformer.TypeRef target, com.googlecode.dex2jar.ir.ts.UniqueQueue<com.googlecode.dex2jar.ir.ts.TypeTransformer.TypeRef> q) {
    if ((target.provideDesc) == null) {
        target.provideDesc = type;
        q.add(target);
    }else {
        java.lang.String mergedType = com.googlecode.dex2jar.ir.ts.TypeTransformer.TypeAnalyze.mergeProviderType(type, target.provideDesc);
        if (!(mergedType.equals(target.provideDesc))) {
            target.provideDesc = mergedType;
            q.add(target);
        }
    }
}