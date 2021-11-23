public long getFalseNegative(T label) {
    de.tudarmstadt.ukp.dkpro.core.api.frequency.util.FrequencyDistribution<T> fd = cfd.getFrequencyDistribution(label);
    long total = 0L;
    if (fd == null) {
        return total;
    }
    for (T key : fd.getKeys()) {
        if (!(key.equals(label))) {
            total += fd.getCount(key);
        }
    }
    return total;
}