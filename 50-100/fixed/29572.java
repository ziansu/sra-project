@java.lang.Override
public void acitveEvent(int ID) {
    indi.zhuhai.pojo.Event_item event_item = this.getEvent_itemByID(ID);
    for (int i = 0; i < (event_item.getEffectItemIdArray().length); i++) {
        itemService.setItemPrice(event_item.getEffectItemIdArray()[i], event_item.getEffectHandle().charAt(0), event_item.getEffectNumber());
    }
}