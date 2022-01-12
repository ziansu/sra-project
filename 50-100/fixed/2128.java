@org.junit.Test
public void testEmotionalState() {
    java.lang.String happy = "I am happy";
    java.lang.String imageLocation = "somewhere";
    int color = android.graphics.Color.BLACK;
    com.example.moodswing.moodswing_000.EmotionalState emotionalState = new com.example.moodswing.moodswing_000.EmotionalState(happy, imageLocation, color);
    assertEquals(emotionalState.getDescription(), happy);
    assertEquals(emotionalState.getColor(), color);
}