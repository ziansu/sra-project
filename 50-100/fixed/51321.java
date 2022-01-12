@org.junit.Test
public void postNewUserAndExpectedHisIdIsNotNull() {
    ua.com.joinit.entity.User user = new ua.com.joinit.entity.User("name", "nickName");
    assertEquals(null, user.getId());
    ua.com.joinit.entity.User mockedUser = new ua.com.joinit.entity.User("name", "nickName");
    mockedUser.setId(1L);
    when(userMockDAO.postUser(user)).thenReturn(mockedUser);
    ua.com.joinit.entity.User postedUser = userService.postUser(user);
    assertEquals(mockedUser.getId(), postedUser.getId());
}