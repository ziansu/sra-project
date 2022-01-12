@java.lang.Override
public java.lang.Void execute() {
    org.eclipse.gmf.runtime.notation.Routing routingValue = getRoutingValue();
    if (!(Routing.TREE_LITERAL.equals(routingValue))) {
        if ((isEdgeSourceCentered()) && (isEdgeTargetCentered())) {
            centerEdgeEnds(CenteringStyle.BOTH, routingValue);
        }else
            if (isEdgeSourceCentered()) {
                centerEdgeEnds(CenteringStyle.SOURCE, routingValue);
            }else
                if (isEdgeTargetCentered()) {
                    centerEdgeEnds(CenteringStyle.TARGET, routingValue);
                }
            
        
    }
    return null;
}