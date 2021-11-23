@org.junit.Test
@ch.heigvd.schoolpulse.TestAuthor(githubId = "Zoruk")
public void theClearFunctionShoudRemoveAllStudents() throws java.io.IOException {
    roulettePair.getClient().loadStudent("Super student");
    ((ch.heigvd.res.labs.roulette.net.client.RouletteV2ClientImpl) (roulettePair.getClient())).clearDataStore();
    assertEquals(roulettePair.getClient().getNumberOfStudents(), 1);
}