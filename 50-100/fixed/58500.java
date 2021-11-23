void cursorChange(int xChange, int yChange) {
    pmark.markChange(((fcontext.insertx()) + xChange), fcontext.inserty());
    changedpro(fcontext.inserty(), ((fcontext.inserty()) - yChange));
}