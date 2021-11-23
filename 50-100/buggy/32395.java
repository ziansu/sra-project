@org.junit.Test
public void testRecognizeFileStringRecognizeOptions() {
    final java.io.File audio = new java.io.File("src/test/resources/sample1.wav");
    final java.lang.String contentType = com.ibm.watson.developer_cloud.http.HttpMediaType.AUDIO_WAV;
    final com.ibm.watson.developer_cloud.speech_to_text.v1.RecognizeOptions options = new com.ibm.watson.developer_cloud.speech_to_text.v1.RecognizeOptions();
    options.continuous(true).model(com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToTextIntegrationTest.EN_BROADBAND16K);
    final com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults results = service.recognize(audio, contentType);
    org.junit.Assert.assertNotNull(results.getResults().get(0).getAlternatives().get(0).getTranscript());
}