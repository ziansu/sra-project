@org.mustbe.consulo.RequiredReadAction
@java.lang.Override
public int getTypesCount() {
    int size = findChildrenByType(CSharpTokens.COMMA).size();
    return size == 0 ? 0 : size + 1;
}