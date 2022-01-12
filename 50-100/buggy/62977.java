@org.junit.Before
public void initTest() {
    curriculumSearchRepository.deleteAll();
    curriculum = new com.hielfsoft.volunteercrowd.domain.Curriculum();
    curriculum.setWebsite(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_WEBSITE);
    curriculum.setCreationDate(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_CREATION_DATE);
    curriculum.setModificationDate(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_MODIFICATION_DATE);
    curriculum.setFile(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_FILE);
    curriculum.setFileContentType(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_FILE_CONTENT_TYPE);
    curriculum.setStatement(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_STATEMENT);
    curriculum.setVision(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_VISION);
    curriculum.setMission(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.DEFAULT_MISSION);
    com.hielfsoft.volunteercrowd.domain.NaturalPerson naturalPerson = naturalPersonService.findOne(com.hielfsoft.volunteercrowd.web.rest.CurriculumResourceIntTest.NATURAL_PERSON_ID);
    curriculum.setNaturalPerson(naturalPerson);
    naturalPerson.setCurriculum(curriculum);
}