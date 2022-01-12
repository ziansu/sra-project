@java.lang.Override
public void persist(org.energyos.espi.common.domain.UsageSummary usageSummary) {
    usageSummaryRepository.persist(usageSummary);
}