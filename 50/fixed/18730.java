@java.lang.Override
public com.brweber2.Call transform(com.brweber2.ast.Statement statement) {
    return new com.brweber2.call.WordCall(statement);
}