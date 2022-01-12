public void testFieldFallback() {
    final com.oasisfeng.hack.Hack.HackedTargetField<java.lang.Integer> field = com.oasisfeng.hack.Hack.into(com.oasisfeng.hack.HackTest.Simple.class).staticField("mIntField").fallbackTo((-1));
    assertEquals((-1), ((int) (field.get())));
    field.set(0);
    assertEquals((-1), ((int) (field.get())));
}