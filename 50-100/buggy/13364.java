public void onEventBackgroundThread(@android.support.annotation.NonNull
de.kuschku.libquassel.functions.types.RpcCallFunction func) {
    de.kuschku.util.AndroidAssert.assertNotNull(func);
    android.util.Log.e("TEST", java.lang.String.valueOf(func));
    de.kuschku.util.AndroidAssert.assertNotNull(connection.getOutputExecutor());
    connection.getOutputExecutor().submit(new de.kuschku.libquassel.protocols.DatastreamPeer.OutputRunnable(de.kuschku.libquassel.primitives.serializers.VariantVariantListSerializer.<de.kuschku.libquassel.functions.types.RpcCallFunction>get(), de.kuschku.libquassel.functions.serializers.UnpackedRpcCallFunctionSerializer.get().serialize(func)));
}