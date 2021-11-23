@java.lang.Override
public void update(java.util.Observable o, java.lang.Object o1) {
    java.lang.System.out.println(("==========State: " + (model.ModelFacade.getInstance().getState())));
    initFromModel();
}