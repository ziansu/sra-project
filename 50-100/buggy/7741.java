public static void update() {
    synchronized(haven.GLState.Slot.class) {
        if (!(haven.GLState.Slot.dirty))
            return ;
        
        haven.GLState.Slot.makedeps(haven.GLState.Slot.all);
        haven.GLState.deplist = new haven.GLState.Slot<?>[haven.GLState.Slot.all.size()];
        for (haven.GLState.Slot s : haven.GLState.Slot.all)
            haven.GLState.deplist[s.depid] = s;
        
        haven.GLState.Slot.dirty = false;
    }
}