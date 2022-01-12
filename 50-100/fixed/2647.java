public play.mvc.Result findById(java.lang.String id) {
    try {
        models.Paciente paciente = null;
        try {
            paciente = pacientesCrud.findById(id);
        } catch (java.lang.Exception e) {
            return error("Object does not exist", 400);
        }
        return ok(paciente);
    } catch (java.lang.Exception e) {
        return error(e.getMessage());
    }
}