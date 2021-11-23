@cucumber.api.java.en.Given(value = "^I have an event payload$")
public void iHaveAnEventPayload() throws java.lang.Throwable {
    event = new ch.heigvd.gamification.api.dto.Event();
    event.setUser("Paul");
    event.setCreateDate(("" + (java.lang.System.currentTimeMillis())));
    event.setType("START_FOLLOW_USER");
    event.setPayload("");
}