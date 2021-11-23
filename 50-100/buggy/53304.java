private void salvaMateria() {
    materia = new br.com.collegenotebook.model.Materia();
    materia.setNome(nome);
    materia.setProfessor(professor);
    materia.setPasta(pastaMateria);
    directory = ((br.com.collegenotebook.CreateDirectoryListener) (getParentFragment()));
    directory.onCreateMateriaListener(pastaMateria);
}