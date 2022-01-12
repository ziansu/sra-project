@java.lang.Override
public void addQuestion(java.lang.String questionText, java.lang.String questionType) {
    entity.getEntries().add(new pt.uc.dei.aor.project.persistence.entity.ScriptEntryEntity(questionText, questionType, entity.getNextPosition()));
}