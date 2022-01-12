private boolean OldSpellingEintrag() {
    begin("OldSpellingEintrag");
    if (!(DeSpracheKopf()))
        return reject();
    
    while (!(OldSpellingTemplate()))
        if (!(Line()))
            return reject();
        
    
    return accept();
}