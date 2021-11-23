@java.lang.Override
public final int hashCode() {
    int h = hashCode;
    if (h == (org.kframework.backend.java.util.Utils.NO_HASHCODE)) {
        h = computeHash();
        h = (h == 0) ? 1 : h;
        hashCode = h;
    }
    return h;
}