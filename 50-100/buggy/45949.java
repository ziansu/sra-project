private javax.swing.JMenuItem createDeleteMenu(java.util.List<edu.brandeis.cs.nlp.mae.model.ExtentTag> tags) throws edu.brandeis.cs.nlp.mae.database.MaeDBException {
    switch (tags.size()) {
        case 0 :
            return null;
        case 1 :
            return getPluralDelete(tags);
        default :
            return getSingleDelete(tags.get(0));
    }
}