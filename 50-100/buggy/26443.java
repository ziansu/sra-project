private com.axelor.apps.stock.db.StockMove _createToProduceStockMove(com.axelor.apps.production.db.ManufOrder manufOrder, com.axelor.apps.base.db.Company company) throws com.axelor.exception.AxelorException {
    com.axelor.apps.stock.db.Location virtualLocation = productionConfigService.getProductionVirtualLocation(productionConfigService.getProductionConfig(company));
    org.joda.time.LocalDateTime plannedEndDateT = manufOrder.getPlannedEndDateT();
    org.joda.time.LocalDate plannedEndDate = (plannedEndDateT != null) ? plannedEndDateT.toLocalDate() : null;
    com.axelor.apps.stock.db.StockMove stockMove = stockMoveService.createStockMove(null, null, company, null, virtualLocation, manufOrder.getProdProcess().getLocation(), plannedEndDate);
    return stockMove;
}