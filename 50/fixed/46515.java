public void removeDisciplina(Disciplina d) throws java.lang.Exception {
    if (!(disciplinas.contains(d)))
        throw new java.lang.Exception("Disciplina inexistente");
    
    disciplinas.remove(d);
}