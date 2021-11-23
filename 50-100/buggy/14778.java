public void testEndsWith() {
    org.junit.Assert.assertEquals(true, org.spf4j.base.Strings.endsWith("dfjkshfks", ""));
    org.junit.Assert.assertEquals(true, org.spf4j.base.Strings.endsWith("dfjkshfks", "hfks"));
    org.junit.Assert.assertEquals(false, org.spf4j.base.Strings.endsWith("dfjkshfks", "hfk"));
    org.junit.Assert.assertEquals(true, org.spf4j.base.Strings.endsWith("dfjkshfks", "dfjkshfks"));
    org.junit.Assert.assertEquals(false, org.spf4j.base.Strings.endsWith("dfjkshfks", "dfjkshfksu"));
}