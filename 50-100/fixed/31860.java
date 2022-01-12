private org.onosproject.net.flow.instructions.Instructions.OutputInstruction getOutputInstruction(org.onosproject.net.flow.TrafficTreatment treatment) {
    if (treatment == null) {
        return null;
    }
    for (org.onosproject.net.flow.instructions.Instruction instruction : treatment.allInstructions()) {
        if ((instruction.type()) == (org.onosproject.net.flow.criteria.Criterion.Type.Type.OUTPUT)) {
            return ((org.onosproject.net.flow.instructions.Instructions.OutputInstruction) (instruction));
        }
    }
    return null;
}