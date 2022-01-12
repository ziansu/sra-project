@org.junit.Test
public void primitiveTypesToJSON() {
    org.junit.Assert.assertEquals(ru.otus.homework_08.JSON.toJSON(15), gson.toJson(15));
    org.junit.Assert.assertEquals(ru.otus.homework_08.JSON.toJSON('c'), gson.toJson('c'));
    org.junit.Assert.assertEquals(ru.otus.homework_08.JSON.toJSON(true), gson.toJson(true));
}