public void start() {
    if ((blockIds.length) == 0) {
        logger.warn("Zero-size blockIds array");
    }
    logger.debug("PrepareMessageSender start method called");
    client.sendRpc(prepareMessage.toByteBuffer(), new org.apache.spark.network.client.RpcResponseCallback() {
        @java.lang.Override
        public void onSuccess(java.nio.ByteBuffer response) {
            logger.debug("Successfully send prepare block's info, ready for the next step");
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable e) {
            logger.error("Failed while send the prepare message");
        }
    });
}