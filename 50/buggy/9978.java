public void modifyOrderedItem(com.aooci.ordercat.vo.OrderedItemVo orderedItemVo) {
    this.orderOperationService.updateOrderedItem(this.operatedOrderVo, orderedItemVo);
    this.selectedOrderedItemVo = orderedItemVo;
}