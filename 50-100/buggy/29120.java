private java.lang.Long getSuspendedDevelopersForAcb(java.lang.Integer year, java.util.List<gov.healthit.chpl.domain.statistics.CertifiedBodyStatistics> cbStats, java.lang.String acb) {
    java.lang.Long count = 0L;
    for (gov.healthit.chpl.domain.statistics.CertifiedBodyStatistics cbStat : cbStats) {
        if ((((cbStat.getYear()) == year) && (cbStat.getName().equalsIgnoreCase(acb))) && (cbStat.getCertificationStatusName().toLowerCase().contains("suspended"))) {
            count = count + (cbStat.getTotalDevelopersWithListings());
        }
    }
    return count;
}