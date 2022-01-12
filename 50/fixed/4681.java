@java.lang.Override
public java.lang.String getFurigana(language.deconjugator.ValidWord context) {
    for (language.dictionary.JMDict.Spelling spelling : spellings) {
        if (!(spelling.isKanji()))
            return spelling.getText();
        
    }
    return "";
}