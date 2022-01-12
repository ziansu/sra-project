private boolean matchProtocols(com.intelliment.entity.Protocol requestProtocol) {
    return (isAnyProtocol()) || (type.equals(requestProtocol.type));
}