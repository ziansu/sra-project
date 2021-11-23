@java.lang.Override
public int hashCode() {
    return ((classLoader.hashCode()) * 31) + (targetClassName.hashCode());
}