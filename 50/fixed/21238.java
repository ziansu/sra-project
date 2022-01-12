@java.lang.Override
public void setTopicResultsHaveChanged() {
    resultColour = android.graphics.Color.MAGENTA;
    if ((activityStarted) == false)
        textView.setBackgroundColor(resultColour);
    
}