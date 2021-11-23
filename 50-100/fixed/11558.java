@java.lang.Override
public void deleteStudy(java.lang.String username, java.lang.String studyUID) throws java.lang.Exception {
    edu.stanford.epad.epadws.models.Study study = getStudy(studyUID);
    if (study == null)
        return ;
    
    new edu.stanford.epad.epadws.models.ProjectToSubjectToStudy().deleteObjects(("study_id=" + (study.getId())));
    new edu.stanford.epad.epadws.models.EpadFile().deleteObjects(("study_id=" + (study.getId())));
    study.delete();
}