private void addActions(java.util.List<? extends tk.thebrightstuff.blindtale.tale.Action> actionList) {
    currentActions.put(view.getNString(tk.thebrightstuff.blindtale.tale.Controller.SKIP), skipAction);
    currentActions.put(view.getNString(tk.thebrightstuff.blindtale.tale.Controller.REPEAT), repeatAction);
    currentActions.put(view.getNString(tk.thebrightstuff.blindtale.tale.Controller.QUIT), quitAction);
    for (tk.thebrightstuff.blindtale.tale.Action a : actionList)
        if (a.isConditionValid(state))
            addActionButton(a);
        
    
}