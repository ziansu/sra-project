@java.lang.Override
public voldemort.utils.ByteArray next() {
    if ((cache) == null) {
        if (!(fetchnextKey())) {
            throw new java.util.NoSuchElementException("Iterate to end");
        }
    }
    voldemort.utils.ByteArray result = cache;
    cache = null;
    return result;
}