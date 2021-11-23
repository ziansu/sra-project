@org.junit.Test
public void isGpsInfoOld_when_lessThan1HourOld_then_false() {
    com.bobs.mount.Mount mount = new com.bobs.mount.Mount();
    mount.setGpsUpdateTime(org.apache.commons.lang.time.DateUtils.addMinutes(new java.util.Date(), (-20)));
    org.junit.Assert.assertFalse(mount.isGpsInfoOld());
}