@java.lang.Override
public java.util.List<com.cooksys.ftd.assignments.collections.model.FatCat> getParentChain(com.cooksys.ftd.assignments.collections.model.Capitalist capitalist) {
    java.util.List<com.cooksys.ftd.assignments.collections.model.FatCat> chain = new java.util.ArrayList<com.cooksys.ftd.assignments.collections.model.FatCat>();
    if ((capitalist == null) || (this.isEmpty()))
        return chain;
    
    while (true) {
        if (!(capitalist.hasParent())) {
            return chain;
        }
        chain.add(capitalist.getParent());
        capitalist = capitalist.getParent();
    } 
}