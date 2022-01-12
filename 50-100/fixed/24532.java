public static net.sf.memoranda.ui.PersonaOptionPane getInstance() {
    net.sf.memoranda.ui.PersonaOptionPane.instance = null;
    if ((net.sf.memoranda.ui.PersonaOptionPane.instance) == null) {
        net.sf.memoranda.ui.PersonaOptionPane.instance = new net.sf.memoranda.ui.PersonaOptionPane();
        net.sf.memoranda.ui.PersonaOptionPane.newPersona = true;
        net.sf.memoranda.ui.PersonaOptionPane.personaName = "";
        net.sf.memoranda.ui.PersonaOptionPane.personaDesc = "";
        net.sf.memoranda.ui.PersonaOptionPane.maleBtn.setSelected(true);
        net.sf.memoranda.ui.PersonaOptionPane.jbInit();
    }
    return net.sf.memoranda.ui.PersonaOptionPane.instance;
}