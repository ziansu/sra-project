@java.lang.Override
public boolean equals(final java.lang.Object object) {
    if ((this) == object) {
        return true;
    }
    if ((object != null) && ((getClass()) != (object.getClass()))) {
        @java.lang.SuppressWarnings(value = "rawtypes")
        final com.javacreed.api.domain.objects.DomainObject other = ((com.javacreed.api.domain.objects.DomainObject) (object));
        return value.equals(other.value);
    }
    return false;
}