public static function.external.subrvis.SubRvisGene getExonDomain(java.lang.String geneName, java.lang.String chr, int pos) {
    java.util.ArrayList<function.external.subrvis.SubRvisGene> exonMap = function.external.subrvis.SubRvisManager.geneExonMap.get(geneName);
    for (function.external.subrvis.SubRvisGene exon : exonMap) {
        if (exon.isPositionIncluded(chr, pos)) {
            return exon;
        }
    }
    return null;
}