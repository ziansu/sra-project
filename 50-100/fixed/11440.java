public java.util.List<org.eyeseetea.malariacare.data.database.model.Question> getQuestions() {
    if ((this.questions) == null) {
        this.questions = new com.raizlabs.android.dbflow.sql.language.Select().from(org.eyeseetea.malariacare.data.database.model.Question.class).where(Question_Table.id_header.eq(this.getId_header())).orderBy(Question_Table.order_pos, true).queryList();
    }
    return questions;
}