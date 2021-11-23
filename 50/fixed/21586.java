@org.junit.Test
public void testRemoveCampaign() {
    int before_remove_length = campaign.getMapList().size();
    campaign.removeMap("1", 0);
    org.junit.Assert.assertEquals((before_remove_length - 1), campaign.getMapList().size());
}