public static <T extends uk.ac.bbsrc.tgac.miso.core.data.DetailedSample> T getParent(java.lang.Class<T> targetParentClass, uk.ac.bbsrc.tgac.miso.core.data.DetailedSample start) {
    for (uk.ac.bbsrc.tgac.miso.core.data.DetailedSample current = uk.ac.bbsrc.tgac.miso.core.util.LimsUtils.deproxify(start.getParent()); current != null; current = uk.ac.bbsrc.tgac.miso.core.util.LimsUtils.deproxify(current.getParent())) {
        if (targetParentClass.isInstance(current)) {
            @java.lang.SuppressWarnings(value = "unchecked")
            T result = ((T) (current));
            return result;
        }
    }
    return null;
}