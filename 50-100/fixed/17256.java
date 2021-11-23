@org.junit.Test
public void VolunteerTest() {
    org.springframework.context.ApplicationContext ac = new org.springframework.context.support.ClassPathXmlApplicationContext("beans.xml");
    com.zdz.util.Thinker weige = ((com.zdz.util.Thinker) (ac.getBean("volunteer")));
    com.zdz.bean.Magician liuqian = ((com.zdz.bean.Magician) (ac.getBean("magician")));
    weige.thinkOfSomething("he will never know what I'm thinking now");
    java.lang.System.out.println(liuqian.getThought());
}