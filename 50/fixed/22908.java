@java.lang.Override
public int hashCode() {
    int result = ((classLoader) != null) ? classLoader.hashCode() : 0;
    result = (31 * result) + (targetClassName.hashCode());
    return result;
}