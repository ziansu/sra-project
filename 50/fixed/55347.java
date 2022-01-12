public static boolean newOutMessage(android.content.Context ctx, org.spinsuite.sync.content.SyncMessage message) {
    return org.spinsuite.bchat.model.SPS_BC_Message.newMessage(ctx, message, MQTTDefaultValues.TYPE_OUT);
}