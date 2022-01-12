@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.antlr.v4.runtime.ParserRuleContext that = ((org.antlr.v4.runtime.ParserRuleContext) (o));
    return (java.util.Objects.equals(children, that.children)) && (java.util.Objects.equals(getText(), that.getText()));
}