public void testLuhnAlogrithmn() {
    assertEquals(true, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(DISCOVER_TEST));
    assertEquals(true, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(JCB_TEST));
    assertEquals(true, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(MC_TEST));
    assertEquals(true, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(VISA_TEST));
    assertEquals(false, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(BAD_TEST));
    assertEquals(false, com.seerauberstudios.creditcheetah.util.LuhnUtil.isLuhnValid(((AMEX_TEST) + (BAD_TEST))));
}