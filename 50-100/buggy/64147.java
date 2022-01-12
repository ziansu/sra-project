public java.util.List<com.ciphertool.sentencebuilder.entities.Word> findAllUniqueWords() {
    org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query();
    query.fields().include("word").include("frequencyWeight");
    java.util.Set<com.ciphertool.sentencebuilder.entities.Word> result = new java.util.HashSet<com.ciphertool.sentencebuilder.entities.Word>(mongoOperations.find(query, com.ciphertool.sentencebuilder.entities.Word.class));
    return new java.util.ArrayList<com.ciphertool.sentencebuilder.entities.Word>(result);
}