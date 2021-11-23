void nailFinished(java.lang.Class nailClass) {
    com.martiansoftware.nailgun.NailStats stats = ((com.martiansoftware.nailgun.NailStats) (allNailStats.get(nailClass)));
    stats.nailFinished();
}