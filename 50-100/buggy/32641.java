public void onEventBackgroundThread(@android.support.annotation.NonNull
de.kuschku.libquassel.functions.types.HandshakeFunction func) {
    de.kuschku.util.AndroidAssert.assertNotNull(func);
    de.kuschku.util.AndroidAssert.assertNotNull(connection.getOutputExecutor());
    java.util.Map<java.lang.String, de.kuschku.libquassel.primitives.types.QVariant> variantMap = de.kuschku.libquassel.objects.MessageTypeRegistry.toVariantMap(func.data).data;
    de.kuschku.util.AndroidAssert.assertNotNull(variantMap);
    connection.getOutputExecutor().submit(new de.kuschku.libquassel.protocols.DatastreamPeer.OutputRunnable(de.kuschku.libquassel.primitives.serializers.VariantVariantListSerializer.get(), de.kuschku.libquassel.protocols.DatastreamPeer.mapToList(variantMap)));
}