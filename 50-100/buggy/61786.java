@org.junit.Test
public void test_mid_path_null() {
    com.afollestad.ason.Ason ason = new com.afollestad.ason.Ason().put("person.name", "Aidan").put("person.born", 1995).put("person.spouse.name", "Waverly");
    org.junit.Assert.assertEquals("Aidan", ason.get("person.name"));
    org.junit.Assert.assertNull(ason.get("person.spouse.spouse.age"));
}