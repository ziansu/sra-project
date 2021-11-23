@br.com.caelum.vraptor.Post(value = "salvar")
public void salvar(avalie.models.Professor professor) {
    java.lang.System.out.print(professorDAO.getClass().getCanonicalName());
    professorDAO.salvar(professor);
    result.include("msg", "Professor Salvo");
    result.redirectTo(avalie.controllers.ProfessorController.class).novo();
}