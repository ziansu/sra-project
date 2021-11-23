public static tondeuse.fr.application.model.Tondeuse loadTondeuseCoordonneesEtOrientation(java.lang.String ligne) throws tondeuse.fr.application.exceptions.IllegalPositionException, tondeuse.fr.application.exceptions.ParsingException {
    java.lang.String[] ligneSplited = ligne.split(" ");
    if ((ligneSplited.length) != 3) {
        throw new tondeuse.fr.application.exceptions.ParsingException((("Les coordonnees et l'orientation doivent etre de la forme x y o(ligne : " + ligne) + ")"));
    }
    tondeuse.fr.application.model.Position position = tondeuse.fr.application.fichiers.LoadElements.loadCoordonnees(new java.lang.String[]{ ligneSplited[0] , ligneSplited[1] });
    tondeuse.fr.application.model.Tondeuse.Orientation orientation = tondeuse.fr.application.fichiers.LoadElements.loadOrientation(ligneSplited[2]);
    return new tondeuse.fr.application.model.Tondeuse(orientation, position);
}