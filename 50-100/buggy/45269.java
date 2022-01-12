@org.junit.Test
public void shouldFindBirthdays() {
    eu.waldonia.ipl.domain.DOB dob = new eu.waldonia.ipl.domain.DOB(26, 11, 1987);
    dobRepository.save(dob);
    eu.waldonia.ipl.domain.DOB dbD = dobRepository.findOne(dob.id);
    dbD = dobRepository.getBirthday(26, 11, 1987);
    org.junit.Assert.assertNotNull(dbD);
    org.junit.Assert.assertEquals(dob, dbD);
    dbD = dobRepository.getBirthday(26, 11, 1986);
    org.junit.Assert.assertNull(dbD);
}