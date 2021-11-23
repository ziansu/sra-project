@org.springframework.transaction.annotation.Transactional(readOnly = false)
public void additional(com.ersoft.web.domain.business.cost.ActualCost actualCost) {
    actualCost.setAdditional(true);
    save(actualCost);
}