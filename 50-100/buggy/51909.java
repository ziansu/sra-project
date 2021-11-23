@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if ((WSeminar.instance.getSourceGraph()) != null)
        WSeminar.instance.transitionTo(new de.dakror.wseminar.graph.layout.FRLayout<java.lang.Integer>(WSeminar.instance.getGraphSize()).render(WSeminar.instance.getSourceGraph(), ((de.dakror.wseminar.Const.defaultCycles) * (WSeminar.instance.getGraphSize())), WSeminar.instance.getSeed()));
    
}