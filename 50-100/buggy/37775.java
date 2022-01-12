private java.math.BigDecimal getCost() {
    java.math.BigDecimal cost = java.math.BigDecimal.ZERO;
    java.util.List<com.ersoft.web.domain.business.contract.FinanceCost> fcs = financeCostService.findActiveAll();
    for (com.ersoft.web.domain.business.contract.FinanceCost financeCost : fcs) {
        cost.add(financeCost.getPrice());
    }
    java.util.List<com.ersoft.web.domain.business.contract.Cost> cs = costService.findActiveAll();
    for (com.ersoft.web.domain.business.contract.Cost c : cs) {
        cost.add(c.getPrice());
    }
    return cost;
}