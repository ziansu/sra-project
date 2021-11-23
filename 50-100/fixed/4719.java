public static void getSavedGame(java.lang.String filePath) throws byui.cit260.detectiveWizard.exceptions.GameControlException {
    byui.cit260.detectiveWizard.model.Game game = null;
    try (java.io.FileInputStream fips = new java.io.FileInputStream(filePath)) {
        java.io.ObjectInputStream input = new java.io.ObjectInputStream(fips);
        game = ((byui.cit260.detectiveWizard.model.Game) (input.readObject()));
    } catch (java.io.FileNotFoundException fnfe) {
        throw new byui.cit260.detectiveWizard.exceptions.GameControlException(fnfe.getMessage());
    } catch (java.lang.Exception e) {
        throw new byui.cit260.detectiveWizard.exceptions.GameControlException(e.getMessage());
    }
    detectiveWizard.DetectiveWizard.setCurrentGame(game);
}