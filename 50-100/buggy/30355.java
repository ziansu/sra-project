private org.onosproject.net.flow.instructions.L2ModificationInstruction.ModTunnelIdInstruction getModTunnelIdInstruction(org.onosproject.net.flow.TrafficTreatment treatment) {
    org.onosproject.net.flow.instructions.L2ModificationInstruction l2ModificationInstruction;
    for (org.onosproject.net.flow.instructions.Instruction instruction : treatment.allInstructions()) {
        if ((instruction.type()) == (org.onosproject.net.flow.instructions.Instruction.Type.L2MODIFICATION)) {
            l2ModificationInstruction = ((org.onosproject.net.flow.instructions.L2ModificationInstruction) (instruction));
            if ((l2ModificationInstruction.subtype()) == (org.onosproject.net.flow.instructions.L2ModificationInstruction.L2SubType.TUNNEL_ID)) {
                return ((org.onosproject.net.flow.instructions.L2ModificationInstruction.ModTunnelIdInstruction) (l2ModificationInstruction));
            }
        }
    }
    return null;
}