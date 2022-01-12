private void setGenome(java.lang.String genomeId) {
    if ((genomeId != null) && (!(genomeId.equals(org.broad.igv.feature.genome.GenomeManager.getInstance().getGenomeId())))) {
        try {
            org.broad.igv.feature.genome.GenomeListItem item = org.broad.igv.feature.genome.GenomeManager.getInstance().findGenomeListItemById(genomeId);
            if (item != null) {
                org.broad.igv.feature.genome.GenomeManager.getInstance().loadGenomeById(genomeId);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}