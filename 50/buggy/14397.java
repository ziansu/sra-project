@javax.annotation.PostConstruct
public void init() {
    this.facesContext = javax.faces.context.FacesContext.getCurrentInstance();
    this.surveyStartDTO = new de.sloth.ejb.survey.SurveyStartDTO();
    surveyStartDTO.setSeconds(5);
}