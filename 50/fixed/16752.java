public java.util.Optional<edu.pitt.dbmi.ccd.db.entity.Attribute> findByVocabAndLevelAndName(edu.pitt.dbmi.ccd.db.entity.Vocabulary vocabulary, java.lang.String level, java.lang.String name) {
    return attributeRepository.findByVocabAndLevelAndName(vocabulary, level, name);
}