android.arch.lifecycle.LiveData<com.hanihashemi.dictionary.network.Resource<com.hanihashemi.dictionary.model.Word>> getDefinition(java.lang.String word) {
    if (shouldCreateNewInstance(definition))
        definition = dictionaryRepository.definition(word);
    
    return definition;
}