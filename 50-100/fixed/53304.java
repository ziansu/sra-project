private void salvaMateria() {
    materia = new br.com.collegenotebook.model.Materia();
    materia.setNome(nome);
    materia.setProfessor(professor);
    materia.setPasta(pastaMateria);
    directory = ((br.com.collegenotebook.CreateDirectoryListener) (getActivity()));
    directory.onCreateMateriaListener(pastaMateria);
}