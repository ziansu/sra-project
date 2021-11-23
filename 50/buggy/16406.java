@org.junit.Test
public void testCreateFail() throws java.io.IOException {
    yukihane.dq10don.communication.dto.CharaSelectDto res = mapper.readValue(yukihane.dq10don.communication.dto.CharaSelectDtoTest.failFile, yukihane.dq10don.communication.dto.CharaSelectDto.class);
    assertEquals(100, res.getResultCode());
    assertNull(res.getEncWebPcNo());
}