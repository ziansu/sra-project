@org.mustbe.consulo.RequiredReadAction
@java.lang.Override
public int getTypesCount() {
    return (findChildrenByType(CSharpTokens.COMMA).size()) + 1;
}