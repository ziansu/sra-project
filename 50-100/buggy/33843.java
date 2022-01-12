protected void setUpStep(int stepNumber) {
    android.widget.LinearLayout stepLayout = createStepLayout(stepNumber);
    if (stepNumber < (numberOfSteps)) {
        android.widget.RelativeLayout stepContent = ((android.widget.RelativeLayout) (stepLayout.findViewById(R.id.step_content)));
        stepContent.addView(stepContentViews.get(stepNumber));
    }else {
        setUpStepLayoutAsConfirmationStepLayout(stepLayout);
    }
    addStepToContent(stepLayout);
}