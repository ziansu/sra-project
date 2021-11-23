@java.lang.Override
public void setProfileReationsData(org.ednovo.gooru.shared.model.user.ProfileRatingsReactionsDO result) {
    reactionsGivenWidget.add(new org.ednovo.gooru.client.mvp.dashboard.ReactionsAndRatingsGivenCommonInfo("reactions", result));
}