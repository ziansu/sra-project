private ast.Type lookup(java.lang.String name) {
    if ((currentLookupContext) == (typechecker.implementation.TypeCheckVisitor.LookupContext.VARIABLE))
        return lookupVariable(name);
    else
        if ((currentLookupContext) == (typechecker.implementation.TypeCheckVisitor.LookupContext.CLASS))
            return lookupClass(name);
        else
            if ((currentLookupContext) == (typechecker.implementation.TypeCheckVisitor.LookupContext.METHOD))
                return lookupMethod(name);
            else
                return lookupVariable(name);
            
        
    
}