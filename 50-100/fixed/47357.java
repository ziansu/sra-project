@cucumber.api.java.en.Then(value = "^Each user should have a pointscale score$")
public void eachUserShouldHaveAPointscaleScore() throws java.lang.Throwable {
    for (ch.heigvd.gamification.api.dto.User u : users) {
        java.util.List<ch.heigvd.gamification.api.dto.UserPointScale> list = api.findUserPointScales(u.getUsername(), world.getToken().getToken());
        for (ch.heigvd.gamification.api.dto.UserPointScale ps : list) {
            org.junit.Assert.assertTrue(((ps.getPoints()) > 0));
        }
    }
}