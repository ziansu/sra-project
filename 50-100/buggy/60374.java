private boolean OldSpellingEintrag() {
    begin("OldSpellingEintrag");
    if (!(DeSpracheKopf()))
        return reject();
    
    while (!(OldSpellingTemplate()))
        if (!(Line()))
            return reject();
        
    
    if (!(EOL()))
        return reject();
    
    return accept();
}