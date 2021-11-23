public void insere(br.com.marco.agenda.model.Aluno aluno) {
    android.database.sqlite.SQLiteDatabase database = getWritableDatabase();
    android.content.ContentValues dados = getDados(aluno);
    long idAluno = database.insert("Alunos", null, dados);
    aluno.setId(idAluno);
}