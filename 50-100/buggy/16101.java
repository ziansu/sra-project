@org.junit.Test
public void testInitialize() throws java.lang.Exception {
    java.lang.Object o = edu.chs.achievement.model.Account.getInstance();
    assertTrue((o == null));
    edu.chs.achievement.model.Account.initialize();
    java.lang.Object o1 = edu.chs.achievement.model.Account.getInstance();
    assertTrue((o1 != null));
    edu.chs.achievement.model.Account.initialize();
    java.lang.Object o2 = edu.chs.achievement.model.Account.getInstance();
    assertTrue((o1 == o2));
}