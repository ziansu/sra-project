@org.junit.Test
public void testAddWords() {
    model = createVoiceModel();
    final java.util.List<com.ibm.watson.developer_cloud.text_to_speech.v1.model.CustomTranslation> expected = instantiateCustomTranslations();
    service.saveWords(model, expected.toArray(new com.ibm.watson.developer_cloud.text_to_speech.v1.model.CustomTranslation[]{  })).execute();
    final java.util.List<com.ibm.watson.developer_cloud.text_to_speech.v1.model.CustomTranslation> words = service.getWords(model).execute();
    org.junit.Assert.assertEquals(expected.size(), words.size());
}