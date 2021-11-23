@org.junit.Test
public void selectByNicknameTest() {
    org.junit.Assert.assertEquals("NICKNAME1", userDAO.selectByNickname("USERNAME1").getNickname());
}