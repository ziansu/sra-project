public java.util.List<model.Item> getItems() {
    items = controller.Queries.getItemsAtAccountId(logedID);
    return items;
}