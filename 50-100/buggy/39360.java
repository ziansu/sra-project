org.snpeff.interval.Transcript findTrFromLatest(org.snpeff.genBank.Feature fcds, org.snpeff.interval.Gene geneLatest, java.util.List<org.snpeff.interval.Transcript> trLatest) {
    if (cdsMatchesGene(fcds, geneLatest)) {
        for (org.snpeff.interval.Transcript tr : trLatest) {
            if ((tr.getCds().isEmpty()) && (cdsMatchesTr(fcds, tr))) {
                return tr;
            }
        }
    }
    return null;
}