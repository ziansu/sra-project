@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<lt.tieto.msi2016.order.model.OrderResults> getOrderResultsByOPeratorID() throws java.io.IOException {
    java.util.List<lt.tieto.msi2016.order.model.OrderResults> resultList = new java.util.ArrayList();
    java.lang.Long userId = securityService.getCurrentUser().getId();
    for (lt.tieto.msi2016.order.repository.model.OrderResultsDb orderResultsDb : repository.getOrderResultsByOperatorId(userId)) {
        resultList.add(mapToOrderResults(orderResultsDb));
    }
    return resultList;
}