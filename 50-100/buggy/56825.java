@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof com.thecoshman.util.Optional)) {
        return false;
    }
    com.thecoshman.util.Optional other = ((com.thecoshman.util.Optional) (obj));
    if (!(isPresent())) {
        return !(other.isPresent());
    }
    return value.equals(other.get());
}