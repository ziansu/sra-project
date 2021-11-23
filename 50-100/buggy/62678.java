public static java.lang.Object call(com.livinglogic.ul4.EvaluationContext context, java.lang.Object obj, java.lang.String attrname) {
    if (obj instanceof com.livinglogic.ul4.UL4GetItemStringWithContext)
        return com.livinglogic.ul4.AttrAST.call(((com.livinglogic.ul4.UL4GetItemStringWithContext) (obj)), attrname);
    else
        if (obj instanceof com.livinglogic.ul4.UL4GetItemWithContext)
            return com.livinglogic.ul4.AttrAST.call(((com.livinglogic.ul4.UL4GetItemWithContext) (obj)), attrname);
        else
            return com.livinglogic.ul4.AttrAST.call(obj, attrname);
        
    
}