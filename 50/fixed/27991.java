public void unlinkLeft() {
    left.parent = null;
    if ((D.scenario) != null)
        D.scenario.add(new algvis.scenario.commands.bstnode.LinkLeftCommand(this, left, false));
    
    left = null;
}