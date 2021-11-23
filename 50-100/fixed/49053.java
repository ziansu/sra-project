public java.lang.String translate(io.github.mdsimmo.bomberman.messaging.Phrase phrase) {
    java.lang.String t = save.getString(phrase.getPath());
    if (t == null) {
        io.github.mdsimmo.bomberman.messaging.Language bup = io.github.mdsimmo.bomberman.messaging.Language.getLanguage(((java.lang.String) (Config.LANGUAGE.getValue(save))));
        if ((bup == null) || (bup == (this)))
            return phrase.getDefault();
        else
            return bup.translate(phrase);
        
    }else
        return t;
    
}