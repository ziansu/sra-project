public void Stop(com.cburch.logisim.circuit.Circuit circ) {
    if (circ == null)
        return ;
    
    SetLabel("", circ, null);
    active.put(circ, false);
}