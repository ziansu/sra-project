@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.Set<de.switajski.priebes.flexibleorders.domain.embeddable.Address> retrieve(java.util.Collection<de.switajski.priebes.flexibleorders.domain.report.ReportItem> reportItems) {
    java.util.Set<de.switajski.priebes.flexibleorders.domain.embeddable.Address> addresses = new java.util.HashSet<de.switajski.priebes.flexibleorders.domain.embeddable.Address>();
    for (de.switajski.priebes.flexibleorders.domain.embeddable.PurchaseAgreement pa : paService.retrieve(reportItems)) {
        addresses.add(chooseAddressOf(pa));
    }
    return addresses;
}