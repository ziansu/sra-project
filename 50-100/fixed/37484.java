public int hashCode() {
    if ((hash) == 0) {
        int ret = java.lang.System.identityHashCode(root);
        ret = (ret * 31) + (java.lang.System.identityHashCode(seq));
        ret = (ret * 31) + (ostate.hashCode());
        hash = (ret == 0) ? 1 : ret;
    }
    return hash;
}