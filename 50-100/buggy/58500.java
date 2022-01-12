void cursorChange(int xChange, int yChange) {
    pmark.markChange(((fcontext.insertx()) + xChange), fcontext.inserty());
    if ((pmark.getMark()) != null)
        changedpro(fcontext.inserty(), ((fcontext.inserty()) - yChange));
    
}