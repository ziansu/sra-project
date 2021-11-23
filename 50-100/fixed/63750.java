@java.lang.Override
public void getFiveStarReviewedResources(org.ednovo.gooru.shared.model.code.UserDashBoardCommonInfoDO result) {
    if (result != null) {
        reactionsWidgetPanel.add((fiveStarReactions = new org.ednovo.gooru.client.mvp.dashboard.FiveStarRatings("fivestarReviews", result)));
        fiveStarReactions.getViewAllLabel().addClickHandler(new com.google.gwt.event.dom.client.ClickHandler() {
            @java.lang.Override
            public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
                getUiHandlers().clickedOnMoreButton(null, "false");
            }
        });
    }
}