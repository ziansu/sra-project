public boolean remove(java.lang.Integer i) {
    try {
        periods.remove(br.com.dextra.pma.utils.CollectionUtils.get(periods, i));
        return true;
    } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
        return false;
    }
}