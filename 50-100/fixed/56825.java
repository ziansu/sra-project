@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof com.thecoshman.util.Optional)) {
        return false;
    }
    com.thecoshman.util.Optional other = ((com.thecoshman.util.Optional) (obj));
    if ((isPresent()) != (other.isPresent())) {
        return false;
    }
    return (!(isPresent())) || (value.equals(other.get()));
}