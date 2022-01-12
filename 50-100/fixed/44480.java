public void setSlot(final jcl.symbols.SymbolStruct<?> slotName, final jcl.LispStruct newSlotValue) {
    if (slots.containsKey(slotName)) {
        slots.put(slotName, newSlotValue);
        return ;
    }
    throw new jcl.conditions.exceptions.SimpleErrorException(((("Slot " + slotName) + " is not present for structure ") + (this)));
}