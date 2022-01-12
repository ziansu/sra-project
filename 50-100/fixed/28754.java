public void onEventBackgroundThread(@android.support.annotation.NonNull
de.kuschku.libquassel.functions.types.HeartbeatReply func) {
    de.kuschku.util.AndroidAssert.assertNotNull(connection.getOutputExecutor());
    connection.getOutputExecutor().submit(new de.kuschku.libquassel.protocols.DatastreamPeer.OutputRunnable(de.kuschku.libquassel.primitives.serializers.VariantVariantListSerializer.<de.kuschku.libquassel.functions.types.InitDataFunction>get(), de.kuschku.libquassel.functions.serializers.HeartbeatReplySerializer.get().serialize(func)));
}