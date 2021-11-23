@java.lang.Override
public deadlybanquet.ai.Whereabouts copy() {
    deadlybanquet.model.TimeStamp t = time;
    if (t != null)
        t = t.copy();
    
    deadlybanquet.ai.PAD p = opinion;
    if (p != null)
        p = p.copy();
    
    return new deadlybanquet.ai.Whereabouts(character, room, p, certainty, t, null);
}