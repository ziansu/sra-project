public void postpone() {
    showDate = new java.util.Date(((new java.util.Date().getTime()) + ((((1000 * 60) * 60) * 24) * (com.dubyniak.bohdan.mycutevocabulary.objects.VocabularyRecord.LEVELS_OF_POSTPONING[rememberingLevel]))));
    if ((rememberingLevel) < ((com.dubyniak.bohdan.mycutevocabulary.objects.VocabularyRecord.LEVELS_OF_POSTPONING.length) - 1))
        (rememberingLevel)++;
    
}