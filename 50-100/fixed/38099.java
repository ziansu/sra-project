@de.metanome.backend.resources.GET
@de.metanome.backend.resources.Path(value = "/get/{id}")
@de.metanome.backend.resources.Produces(value = "application/json")
@java.lang.Override
public de.metanome.backend.results_db.FileInput get(@de.metanome.backend.resources.PathParam(value = "id")
long id) {
    try {
        de.metanome.backend.results_db.FileInput fileInput = ((de.metanome.backend.results_db.FileInput) (de.metanome.backend.results_db.HibernateUtil.retrieve(de.metanome.backend.results_db.FileInput.class, id)));
        return fileInput;
    } catch (de.metanome.backend.results_db.EntityStorageException e1) {
        e1.printStackTrace();
        throw new de.metanome.backend.resources.WebException(e1, Response.Status.BAD_REQUEST);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        throw new de.metanome.backend.resources.WebException(e, Response.Status.BAD_REQUEST);
    }
}