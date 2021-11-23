@android.support.annotation.Nullable
public Model valueOrNull() {
    if ((offset) > 0) {
        return getOrNull(offset);
    }
    return getOrNull(0);
}