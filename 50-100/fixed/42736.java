@java.lang.Override
public it.unitn.disi.smatch.data.ling.ISense createSense(java.lang.String id, java.lang.String language) {
    it.unitn.disi.sweb.core.kb.model.KnowledgeBase kb = knowledgeBaseService.readKnowledgeBase("uk");
    it.unitn.disi.smatch.oracles.ukc.Vocabulary voc = vocabularyservice.readVocabulary(kb, language);
    it.unitn.disi.smatch.oracles.ukc.Synset synset = vocabularyservice.readSynset(java.lang.Long.valueOf(id).longValue());
    return new it.unitn.disi.smatch.oracles.ukc.UKCSense(synset.getConcept().getId(), synset.getId(), language, this);
}