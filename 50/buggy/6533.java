@android.support.annotation.Nullable
public java.lang.String getExisting(java.lang.String name) {
    java.lang.String existing = mCanonicalMap.get(makeCanonical(name));
    return existing == null ? name : existing;
}