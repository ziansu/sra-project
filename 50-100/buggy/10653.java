@java.lang.Override
protected void init() throws cc.redpen.RedPenException {
    if ((getSymbolTable().getLang().equals("ja")) && (!(getConfigAttribute("min_len").isPresent())))
        getProperties().put("min_len", 1);
    
}