@play.db.jpa.Transactional
public static play.mvc.Result show() {
    java.lang.String message = play.mvc.Controller.flash("message");
    java.util.List<models.DicaGenerica> dicas = controllers.MetaDicas.dao.findAllByClass(models.DicaGenerica.class);
    java.util.List<models.MetaDica> metaDicas = new java.util.ArrayList<models.MetaDica>();
    for (models.DicaGenerica dica : dicas) {
        if (dica instanceof models.MetaDica) {
            metaDicas.add(((models.MetaDica) (dica)));
        }
    }
    return play.mvc.Results.ok(metadicas.render(message, dicas, metaDicas));
}