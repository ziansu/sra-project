@cucumber.api.java.en.Then(value = "^Rewards Level should be \"([^\"]*)\"$")
public void rewards_Level_should_be(java.lang.String rewardLevel) throws java.lang.Throwable {
    assertTrue(tddApp.getMemberRewardLevelForMember(userId).equals(rewardLevel));
}