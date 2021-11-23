public java.math.BigDecimal getMainContractPrice(com.ersoft.web.domain.business.contract.MainContract mainContract) {
    java.math.BigDecimal price = java.math.BigDecimal.ZERO;
    if (mainContract != null) {
        java.util.List<com.ersoft.web.domain.business.contract.SubContract> subs = subContractService.findActiveAll(com.ersoft.web.service.business.SubContractPredicates.mainContractPredicate(mainContract), new org.springframework.data.domain.Sort(org.springframework.data.domain.Sort.Direction.DESC, "createdDate"));
        for (com.ersoft.web.domain.business.contract.SubContract sub : subs) {
            price = price.add(getSubContractPrice(sub));
        }
    }
    return price;
}