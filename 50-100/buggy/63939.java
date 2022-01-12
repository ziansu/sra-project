public void addContents(com.obliner.ui.OObject ob) {
    com.obliner.ui.OObject contents = ob.getBucket().findChildByName(UIKeyword.CONTENTS);
    if (contents == null)
        return ;
    
    for (com.obliner.ui.OObject item : contents.getBucket()) {
        com.obliner.ui.TypeSpec spec = item.getTypeSpec();
        if (spec instanceof com.obliner.ui.OWindowItem) {
            javax.swing.JComponent comp = ((com.obliner.ui.OWindowItem) (spec)).createComponent(this.engine, ob);
            this.add(comp);
        }
    }
}