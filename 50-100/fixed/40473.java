public static dk.dtu.compute.mbse.yawl.TType getSplitType(dk.dtu.compute.mbse.yawl.Transition tra) {
    if (tra instanceof dk.dtu.compute.mbse.yawl.TransitionType) {
        tra = ((dk.dtu.compute.mbse.yawl.Transition) (tra));
        dk.dtu.compute.mbse.yawl.TransitionType t = ((dk.dtu.compute.mbse.yawl.TransitionType) (tra));
        if ((t != null) && ((t.getText()) != null)) {
            return t.getText();
        }
    }
    return dk.dtu.compute.mbse.yawl.TType.OR;
}