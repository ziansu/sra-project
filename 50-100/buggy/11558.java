@java.lang.Override
public void deleteStudy(java.lang.String username, java.lang.String studyUID) throws java.lang.Exception {
    edu.stanford.epad.epadws.models.Study study = getStudy(studyUID);
    if (study == null)
        return ;
    
    edu.stanford.epad.epadws.models.ProjectToSubjectToStudy projSubjStudy = ((edu.stanford.epad.epadws.models.ProjectToSubjectToStudy) (new edu.stanford.epad.epadws.models.ProjectToSubjectToStudy().getObject(("study_id=" + (study.getId())))));
    projSubjStudy.delete();
    new edu.stanford.epad.epadws.models.EpadFile().deleteObjects(("study_id=" + (study.getId())));
    study.delete();
}