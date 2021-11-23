@org.junit.Test
public void contextLoads() {
    edu.mum.swe.msched.service.UserService userService = new edu.mum.swe.msched.service.impl.UserServiceImpl();
    userService.getAllUsers().forEach(java.lang.System.out::print);
}