@org.junit.Test
public void testInitialize() throws java.lang.Exception {
    final java.lang.Object o = edu.chs.achievement.model.Account.getInstance();
    edu.chs.achievement.model.Account.initialize();
    final java.lang.Object o1 = edu.chs.achievement.model.Account.getInstance();
    edu.chs.achievement.model.Account.initialize();
    final java.lang.Object o2 = edu.chs.achievement.model.Account.getInstance();
    assertTrue((((o1.equals(o2)) && (o == null)) && (o1 != null)));
}