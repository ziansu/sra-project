@org.junit.Test
public void primitiveTypesToJSON() {
    org.junit.Assert.assertEquals(gson.toJson(15), ru.otus.homework_08.JSON.toJSON(15));
    org.junit.Assert.assertEquals(gson.toJson('c'), ru.otus.homework_08.JSON.toJSON('c'));
    org.junit.Assert.assertEquals(gson.toJson(true), ru.otus.homework_08.JSON.toJSON(true));
}