public void testClickOnAchievement() {
    android.view.View child0 = lvAchievements.getChildAt(0);
    child0.performClick();
    org.junit.Assert.assertFalse(ivSmartplane.isShown());
    org.junit.Assert.assertFalse(tvDescription.getText().toString().isEmpty());
    verify(ivSmartplane).setVisibility(View.INVISIBLE);
    verify(tvDescription).setText(org.mockito.Matchers.anyString());
    verify(child0).setBackgroundColor(android.graphics.Color.parseColor("#696969"));
}