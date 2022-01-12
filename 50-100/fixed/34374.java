public void undoDefStats(boolean pic, boolean tackle, boolean loss, boolean fumblerec, boolean forcedfum, boolean sack, boolean td) {
    if (pic)
        (pics)--;
    
    if (tackle)
        (tackles)--;
    
    if (tackle && loss)
        (tfls)--;
    
    if (fumblerec)
        (fumblerecs)--;
    
    if (sack)
        (sacks)--;
    
    if (td)
        (deftds)--;
    
    if (forcedfum)
        (forcedfums)--;
    
}