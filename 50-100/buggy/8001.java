public void delLabel(int label) {
    for (java.util.Map<java.util.List<org.projectfloodlight.openflow.protocol.instruction.OFInstruction>, java.lang.Integer> m : switchLabelMap.values()) {
        for (java.util.List<org.projectfloodlight.openflow.protocol.instruction.OFInstruction> list : m.keySet()) {
            java.lang.Integer i = m.get(list);
            if (i == null) {
                java.lang.System.out.println("111111");
            }
            if ((i.intValue()) == label) {
                m.remove(list);
                break;
            }
        }
    }
    net.floodlightcontroller.savi.forwarding.mpls.MPLSLabelManager.labelQueue.add(label);
}