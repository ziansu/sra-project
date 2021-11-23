@org.junit.Test
public void stringToJSON() {
    org.junit.Assert.assertEquals(gson.toJson("abc"), ru.otus.homework_08.JSON.toJSON("abc"));
}