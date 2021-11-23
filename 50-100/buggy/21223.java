@java.lang.Override
public com.layer.atlas.messagetypes.text.TextCellFactory.TextInfo parseContent(com.layer.sdk.LayerClient layerClient, com.layer.sdk.messaging.Message message) {
    com.layer.sdk.messaging.MessagePart part = message.getMessageParts().get(0);
    java.lang.String text = (part.isContentReady()) ? new java.lang.String(part.getData()) : "";
    java.lang.String name;
    com.layer.sdk.messaging.Identity sender = message.getSender();
    if (sender != null) {
        name = (com.layer.atlas.util.Util.getDisplayName(sender)) + ": ";
    }else {
        name = "";
    }
    return new com.layer.atlas.messagetypes.text.TextCellFactory.TextInfo(text, name);
}