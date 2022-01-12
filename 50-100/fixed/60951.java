@org.junit.Before
public void setup() {
    org.mockito.MockitoAnnotations.initMocks(this);
    objectUnderTest = new mindbadger.cah.websocket.GameMessageController();
    java.util.Map<java.lang.String, mindbadger.cah.action.Action> actions = new java.util.HashMap<java.lang.String, mindbadger.cah.action.Action>();
    actions.put(mindbadger.cah.websocket.GameMessageControllerTest.PLAYER_ACTION, mockAction);
    objectUnderTest.actions = actions;
}