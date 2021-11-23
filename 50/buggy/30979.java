@java.lang.Override
public boolean isLessEqual(zorbage.type.data.UnboundedIntMember a, zorbage.type.data.UnboundedIntMember b) {
    return (a.v().compareTo(b.v())) < 1;
}