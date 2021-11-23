@java.lang.Override
public ca.mcgill.cs.stg.jetuml.graph.ObjectNode clone() {
    ca.mcgill.cs.stg.jetuml.graph.ObjectNode cloned = ((ca.mcgill.cs.stg.jetuml.graph.ObjectNode) (super.clone()));
    cloned.aName = ((ca.mcgill.cs.stg.jetuml.framework.MultiLineString) (aName.clone()));
    cloned.aFields = new java.util.ArrayList<>();
    return cloned;
}