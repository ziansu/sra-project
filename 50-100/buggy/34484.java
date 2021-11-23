@javafx.fxml.FXML
public void initialize() throws java.net.MalformedURLException {
    java.lang.String urlSkills = new java.io.File("html/skills.html").toURI().toURL().toExternalForm();
    java.lang.String urlAbilities = new java.io.File("html/abilities.html").toURI().toURL().toExternalForm();
    webViewSkills.getEngine().load(urlSkills);
    webViewAbilities.getEngine().load(urlAbilities);
}