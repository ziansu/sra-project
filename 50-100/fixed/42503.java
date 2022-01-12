public java.util.List<edu.umn.cs.crisys.smaccm.aadl2rtos.model.thread.DispatchableInputPort> getDispatcherList() {
    java.util.List<edu.umn.cs.crisys.smaccm.aadl2rtos.model.thread.DispatchableInputPort> l = new java.util.ArrayList<>();
    for (edu.umn.cs.crisys.smaccm.aadl2rtos.model.thread.DataPort p : this.ports) {
        if (p instanceof edu.umn.cs.crisys.smaccm.aadl2rtos.model.thread.DispatchableInputPort) {
            l.add(((edu.umn.cs.crisys.smaccm.aadl2rtos.model.thread.DispatchableInputPort) (p)));
        }
    }
    return l;
}