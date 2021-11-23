@org.springframework.web.bind.annotation.RequestMapping(value = "/studies/{studyId}/notes", produces = org.springframework.http.MediaType.TEXT_HTML_VALUE, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String viewStudyNotes(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.lang.Long studyId) {
    uk.ac.ebi.spot.goci.model.Study study = studyRepository.findOne(studyId);
    model.addAttribute("study", study);
    java.util.Collection<uk.ac.ebi.spot.goci.model.StudyNote> studyNotes = study.getNotes();
    uk.ac.ebi.spot.goci.curation.model.MultiStudyNoteForm msnf = studyNoteOperationsService.generateMultiStudyNoteForm(study.getNotes(), study);
    model.addAttribute("multiStudyNoteForm", msnf);
    return "study_notes";
}