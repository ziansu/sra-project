@org.junit.Test
public void testMultipleExclusions() {
    org.junit.Assert.assertTrue(heros.alias.AccessPathUtil.isPrefixOf(new heros.alias.Fact("a^f,g"), new heros.alias.Fact("a^f")));
    org.junit.Assert.assertFalse(heros.alias.AccessPathUtil.isPrefixOf(new heros.alias.Fact("a^f"), new heros.alias.Fact("a^f,g")));
    org.junit.Assert.assertTrue(heros.alias.AccessPathUtil.isPrefixOf(new heros.alias.Fact("a^f,g"), new heros.alias.Fact("a^f")));
    org.junit.Assert.assertTrue(heros.alias.AccessPathUtil.isPrefixOf(new heros.alias.Fact("a^f,g"), new heros.alias.Fact("a^g")));
}