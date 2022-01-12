public boolean evaluate() {
    for (se.hal.struct.Trigger trigger : triggerList) {
        if (!(trigger.evaluate()))
            return false;
        
    }
    return true;
}