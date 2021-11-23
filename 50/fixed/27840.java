@org.junit.Test
public void testCreateNewTest() {
    when(verificationRepository.findOne(com.softserve.edu.service.CalibrationTestServiceTest.verificationId)).thenReturn(verification);
    calibrationTestService.createNewTest(calibrationTest, com.softserve.edu.service.CalibrationTestServiceTest.date, com.softserve.edu.service.CalibrationTestServiceTest.verificationId);
    verify(verificationRepository).findOne(com.softserve.edu.service.CalibrationTestServiceTest.verificationId);
}