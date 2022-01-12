@java.lang.Override
public void addQuestion(java.lang.String questionText, java.lang.String questionType) {
    java.lang.System.out.println(entity.getEntries());
    entity.getEntries().add(new pt.uc.dei.aor.project.persistence.entity.ScriptEntryEntity(questionText, questionType, entity.getNextPosition()));
}