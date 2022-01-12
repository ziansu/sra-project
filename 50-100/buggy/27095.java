protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    model.Paciente paciente = new model.Paciente();
    paciente.setNome(request.getParameter("nome"));
    paciente.setCpf(java.lang.Integer.parseInt(request.getParameter("cpf")));
    paciente.setRg(java.lang.Integer.parseInt(request.getParameter("rg")));
    if ((paciente.getPacienteId()) == 0)
        dao.adicionar(paciente);
    else {
        dao.alterar(paciente);
    }
}