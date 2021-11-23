public void rpc(@android.support.annotation.NonNull
java.lang.String procedureName, @android.support.annotation.NonNull
java.util.List<de.kuschku.libquassel.primitives.types.QVariant> params) {
    de.kuschku.util.AndroidAssert.assertNotNull(provider);
    provider.dispatch(new de.kuschku.libquassel.functions.types.RpcCallFunction(procedureName, params));
}