@java.lang.Override
public boolean canExecute() {
    java.util.Collection<cn.nukkit.item.Item> haveItems = new java.util.ArrayList<>();
    java.util.Collection<cn.nukkit.item.Item> needItems = new java.util.ArrayList<>();
    return (((this.matchItems(needItems, haveItems)) && (haveItems.isEmpty())) && (needItems.isEmpty())) && (!(this.transactions.isEmpty()));
}