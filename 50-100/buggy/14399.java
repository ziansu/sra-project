@java.lang.Override
public java.lang.Object execute(com.oracle.truffle.api.frame.VirtualFrame virtualFrame) {
    java.lang.Object value = condition.execute(virtualFrame);
    if ((!(java.lang.Boolean.FALSE.equals(value))) && (ClojureNilNode.NIL.equals(value))) {
        return thenNode.execute(virtualFrame);
    }else {
        return elseNode.execute(virtualFrame);
    }
}