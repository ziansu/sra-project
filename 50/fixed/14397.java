@javax.annotation.PostConstruct
public void init() {
    this.surveyStartDTO = new de.sloth.ejb.survey.SurveyStartDTO();
    surveyStartDTO.setSeconds(5);
}