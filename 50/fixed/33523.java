@org.junit.Test
public void GIVEN_different_greater_then_or_equal_to_three_WHEN_get_score_THEN_get_score_advanced() {
    assertEquals("Server Advanced", com.oocl.zach.test.TennisScore.GetTennisScore(4, 3));
    assertEquals("Receiver Advanced", com.oocl.zach.test.TennisScore.GetTennisScore(3, 4));
}