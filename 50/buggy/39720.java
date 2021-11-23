@java.lang.Override
public int hashCode() {
    return (((className.hashCode()) + (methodName.hashCode())) + (methodDescriptor.hashCode())) + (returnLine.hashCode());
}