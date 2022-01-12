@java.lang.Override
public void deletePlayer(int Slot) {
    if ((slots[Slot]) == null)
        throw new java.lang.RuntimeException((("Slot " + Slot) + "is already empty."));
    
    slots[Slot] = null;
}