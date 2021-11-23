@java.lang.Override
public final synchronized void loadDiff(final greycat.struct.Buffer buffer) {
    if ((internal_load(buffer, false)) && ((_hash) != (greycat.Constants.EMPTY_HASH))) {
        _hash = greycat.Constants.EMPTY_HASH;
        if ((_space) != null) {
            _space.notifyUpdate(_index);
        }
    }
}