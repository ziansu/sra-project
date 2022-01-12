@org.junit.Test
public void testCreate() {
    models.Action act = models.Action.createAction(0, "decript", 0, 0, new models.Preset(), new models.Script());
    java.util.List<models.Action> out = Action.find.where().ilike("description", "decript").findList();
    org.junit.Assert.assertEquals(out.size(), 1);
    org.junit.Assert.assertEquals(out.get(0), act);
}