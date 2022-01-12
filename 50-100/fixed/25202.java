@java.lang.Override
public void passtiveEvent(int ID) {
    indi.zhuhai.pojo.Event_item event_item = this.getEvent_itemByID(ID);
    for (int i = 0; i < (event_item.getEffectItemIdArray().length); i++) {
        itemService.backStartPrice(event_item.getEffectItemIdArray()[i]);
    }
}