@com.raizlabs.android.dbflow.annotation.OneToMany(methods = { OneToMany.Method.SAVE , OneToMany.Method.DELETE }, variableName = "questions")
public java.util.List<org.eyeseetea.malariacare.database.model.Question> getQuestions() {
    this.questions = new com.raizlabs.android.dbflow.sql.language.Select().from(org.eyeseetea.malariacare.database.model.Question.class).where(com.raizlabs.android.dbflow.sql.builder.Condition.column(Question.Table.HEADER_ID_HEADER).eq(this.getId_header())).orderBy(Question.Table.ORDER_POS).queryList();
    return questions;
}