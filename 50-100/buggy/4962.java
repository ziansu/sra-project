@org.junit.Test
public void testUpdateWithoutVersionControl() {
    com.baomidou.mybatisplus.test.mysql.entity.User user = userService.selectById(11);
    org.junit.Assert.assertEquals(1, user.getAge().intValue());
    user.setVersion(null);
    user.setAge(2);
    userService.updateById(user);
    user = userService.selectById(11);
    org.junit.Assert.assertEquals(2, user.getAge().intValue());
    org.junit.Assert.assertEquals(1, user.getVersion().intValue());
}