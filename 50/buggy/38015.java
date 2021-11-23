@java.lang.Override
public lu.kbl.domain.VniHistory findLasVniForAFund(java.lang.Long fundId) {
    final lu.kbl.service.impl.List<lu.kbl.domain.VniHistory> dateDesc = vniHistoryRepository.findAllByFund_IdOrderByDateDesc(fundId);
    return dateDesc.get(0);
}