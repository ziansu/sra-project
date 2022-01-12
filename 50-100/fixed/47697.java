public void initStep(java.lang.String name, priv.bajdcc.LALR1.grammar.runtime.RuntimeCodePage page, java.util.List<priv.bajdcc.LALR1.grammar.runtime.RuntimeCodePage> refers, int pc, priv.bajdcc.LALR1.grammar.runtime.RuntimeObject obj) throws java.lang.Exception {
    add(name, page);
    currentPage = page;
    stack.reg.pageId = name;
    stack.reg.execId = -1;
    switchPage();
    if (refers != null)
        pageRefer.get(pageName).addAll(refers);
    
    opOpenFunc();
    if (obj != null) {
        opPushObj(obj);
        opPushArgs();
    }
    opPushPtr(pc);
    opCall();
}