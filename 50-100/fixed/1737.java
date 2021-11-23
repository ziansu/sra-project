public void setGuide(org.esn.mobilit.models.Guide guide) {
    org.esn.mobilit.renderers.GuideRenderer sgr = new org.esn.mobilit.renderers.GuideRenderer();
    java.lang.String survivalContent = sgr.renderSurvivalGuide(guide);
    if (((guide != null) && (guide.isActivated())) && (guide.isCreated())) {
        guideContent.setText(android.text.Html.fromHtml(survivalContent), TextView.BufferType.SPANNABLE);
    }else {
        guideContent.setText(R.string.info_message_guide_not_displayable, TextView.BufferType.SPANNABLE);
    }
}