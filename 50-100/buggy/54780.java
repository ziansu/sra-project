public void selectMethod(org.objectweb.asm.tree.ClassNode cn, org.objectweb.asm.tree.MethodNode mn) {
    this.currentNode = cn;
    me.lpk.util.OpUtils.clearLabelCache();
    sp.selectMethod(cn, mn);
    if (!(clist.loadInstructions(mn))) {
        clist.setSelectedIndex((-1));
    }
    tcblist.addNodes(cn, mn);
    lvplist.addNodes(cn, mn);
    dp.setText("");
    tabbedPane.selectClass(cn);
}