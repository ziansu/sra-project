@java.lang.Override
public lu.kbl.domain.VniHistory findLasVniForAFund(java.lang.Long fundId) {
    final java.util.List<lu.kbl.domain.VniHistory> dateDesc = vniHistoryRepository.findAllByFund_IdOrderByDateDesc(fundId);
    return dateDesc.get(0);
}