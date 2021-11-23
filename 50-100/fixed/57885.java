@java.lang.Override
public ca.mcgill.cs.stg.jetuml.graph.ImplicitParameterNode clone() {
    ca.mcgill.cs.stg.jetuml.graph.ImplicitParameterNode cloned = ((ca.mcgill.cs.stg.jetuml.graph.ImplicitParameterNode) (super.clone()));
    cloned.aName = ((ca.mcgill.cs.stg.jetuml.framework.MultiLineString) (aName.clone()));
    cloned.aCallNodes = new java.util.ArrayList<>();
    for (ca.mcgill.cs.stg.jetuml.graph.ChildNode child : aCallNodes) {
        ca.mcgill.cs.stg.jetuml.graph.ChildNode clonedChild = ((ca.mcgill.cs.stg.jetuml.graph.ChildNode) (child.clone()));
        clonedChild.setParent(cloned);
        cloned.aCallNodes.add(clonedChild);
    }
    return cloned;
}