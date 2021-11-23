@java.lang.Override
protected void init() throws cc.redpen.RedPenException {
    super.init();
    if ((getSymbolTable().getLang().equals("ja")) && (!(getConfigAttribute("min_len").isPresent())))
        getProperties().put("min_len", 1);
    
}