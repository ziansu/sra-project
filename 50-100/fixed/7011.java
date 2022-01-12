public void slotsChanged(clojure.lang.IPersistentMap addedslots, java.lang.Boolean clear) {
    if (clear)
        edu.buffalo.cse.sneps3.gui.business.Slot.clearSlots();
    
    java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Slot> s = new java.util.ArrayList<edu.buffalo.cse.sneps3.gui.business.Slot>(edu.buffalo.cse.sneps3.gui.business.Slot.reinitializeSlots(addedslots, clear));
    for (edu.buffalo.cse.sneps3.gui.business.IView i : views) {
        i.slotUpdate(s, clear);
    }
}