public javafx.collections.ObservableList<lahome.rotateTool.module.PurchaseItem> getPurchaseItemListWithPo(java.lang.String po) {
    javafx.collections.ObservableList<lahome.rotateTool.module.PurchaseItem> list = javafx.collections.FXCollections.observableArrayList();
    for (lahome.rotateTool.module.RotateItem rotateItem : PartsList) {
        for (lahome.rotateTool.module.StockItem stockItem : rotateItem.getStockItemObsList()) {
            if ((stockItem.isMainStockItem()) && (po.equals(stockItem.getPo()))) {
                list.addAll(stockItem.getPurchaseItems());
            }
        }
    }
    list.sort(PurchaseItem::compareTo);
    return list;
}