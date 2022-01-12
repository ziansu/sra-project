public static net.sf.memoranda.ui.PersonaOptionPane getInstance(net.sf.memoranda.Persona person) {
    net.sf.memoranda.ui.PersonaOptionPane.instance = null;
    if ((net.sf.memoranda.ui.PersonaOptionPane.instance) == null) {
        net.sf.memoranda.ui.PersonaOptionPane.instance = new net.sf.memoranda.ui.PersonaOptionPane();
        net.sf.memoranda.ui.PersonaOptionPane.newPersona = false;
        net.sf.memoranda.ui.PersonaOptionPane.currentPersona = person;
        net.sf.memoranda.ui.PersonaOptionPane.personaName = person.getName();
        net.sf.memoranda.ui.PersonaOptionPane.personaGender = person.getGender();
        if (net.sf.memoranda.ui.PersonaOptionPane.personaGender.equalsIgnoreCase("male")) {
            net.sf.memoranda.ui.PersonaOptionPane.maleBtn.setSelected(true);
        }else {
            net.sf.memoranda.ui.PersonaOptionPane.femaleBtn.setSelected(true);
        }
        net.sf.memoranda.ui.PersonaOptionPane.personaDesc = person.getDescription();
        net.sf.memoranda.ui.PersonaOptionPane.jbInit();
    }
    return net.sf.memoranda.ui.PersonaOptionPane.instance;
}