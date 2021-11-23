@org.springframework.transaction.annotation.Transactional
public void orderNewItem(java.lang.Integer desktopNumber, java.lang.Integer menuitemId, java.lang.Integer count) {
    tina.coffee.data.model.OrderItemEntity entity = createOrderItem(desktopNumber, menuitemId, count);
    orderService.refreshOrderPrice(entity.getOrder());
    if (entity.getMenuItem().isToChief()) {
        java.lang.String itemName = "cococla";
        int _count = 10;
        java.lang.String content = (itemName + ":") + _count;
    }
    updateImportProductCount(entity.getMenuItem(), count);
}