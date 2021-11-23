@java.lang.Override
public void onDataChanged(com.google.android.gms.wearable.DataEventBuffer dataEvents) {
    for (com.google.android.gms.wearable.DataEvent event : dataEvents) {
        if ((event.getType()) == (com.google.android.gms.wearable.DataEvent.TYPE_CHANGED)) {
            com.google.android.gms.wearable.DataItem dataItem = event.getDataItem();
            switch (com.sousoum.shared.Message.getMessageType(dataItem)) {
                case ACTION_TYPE :
                    int productAction = com.sousoum.shared.Message.decodeActionTypeMessage(dataItem);
                    onActionTypeChanged(productAction);
                    break;
                case INTERACTION_TYPE :
                    int interactionType = com.sousoum.shared.Message.decodeInteractionTypeMessage(dataItem);
                    onInteractionTypeChanged(interactionType);
            }
        }
    }
}