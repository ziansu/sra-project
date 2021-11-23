public void PersonHinzu() {
    threadwithpacher2.Person_Hinzu hinzu = new threadwithpacher2.Person_Hinzu(this, true);
    hinzu.setVisible(true);
    if (hinzu.getIsKorrekt()) {
        threadwithpacher2.Person p = hinzu.getPerson();
        model.add(p);
        model.update();
    }
}