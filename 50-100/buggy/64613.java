@org.junit.Before
public void setUp() throws net.sharkfw.knowledgeBase.SharkKBException, org.json.JSONException {
    mSharkNet = net.sharksystem.api.impl.SharkNetEngine.getSharkNet();
    berlin.htw.schneider.viktor.sharknet.Dummy.createDummyData();
    mSharkNet.setActiveProfile(mSharkNet.getProfiles().get(1), "");
    java.lang.System.out.println(("%%%%%%%%%%%% " + (mSharkNet.getMyProfile().getNickname())));
}