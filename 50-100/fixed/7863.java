@java.lang.Override
public final boolean titleChanged(final xyz.algogo.core.Algorithm algorithm, final java.lang.String title, final java.lang.String newTitle) {
    if ((newTitle != null) && (!(newTitle.isEmpty()))) {
        algorithmChanged(false);
        this.setTitle(buildTitle(newTitle, algorithm.getAuthor()));
        return true;
    }
    javax.swing.JOptionPane.showMessageDialog(this, xyz.algogo.desktop.utils.LanguageManager.getString("joptionpane.invalidtitle", newTitle), xyz.algogo.desktop.utils.LanguageManager.getString("joptionpane.error"), javax.swing.JOptionPane.ERROR_MESSAGE);
    return false;
}