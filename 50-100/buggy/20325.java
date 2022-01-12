@java.lang.Override
public final boolean authorChanged(final xyz.algogo.core.Algorithm algorithm, final java.lang.String author, final java.lang.String newAuthor) {
    if ((newAuthor != null) && (!(newAuthor.isEmpty()))) {
        algoChanged = true;
        this.setTitle(buildTitle(algorithm.getTitle(), newAuthor));
        algorithmChanged(false);
        return true;
    }
    javax.swing.JOptionPane.showMessageDialog(this, xyz.algogo.desktop.utils.LanguageManager.getString("joptionpane.invalidauthor", newAuthor), xyz.algogo.desktop.utils.LanguageManager.getString("joptionpane.error"), javax.swing.JOptionPane.ERROR_MESSAGE);
    return false;
}