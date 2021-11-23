@play.mvc.With(value = util.TokenAuth.class)
public play.mvc.Result findById(java.lang.String id) {
    try {
        java.lang.SecurityManager.validatePermission("view-patient", Http.Context.current.get().flash().get("token"));
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