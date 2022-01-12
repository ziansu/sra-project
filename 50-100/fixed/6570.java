@java.lang.Override
public int hashCode() {
    int result = ((color) != null) ? color.hashCode() : 0;
    result = (31 * result) + (type.hashCode());
    result = (31 * result) + ((image) != null ? image.hashCode() : 0);
    return result;
}