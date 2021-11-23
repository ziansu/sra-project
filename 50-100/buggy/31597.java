private void amZug(de.verbund.watten.common.Kommando kdo) {
    boolean schlag = false;
    boolean parameter = false;
    if (!(kdo.getParameter().isEmpty())) {
        schlag = ((boolean) (kdo.getParameter().get(0)));
        parameter = true;
    }
    if (parameter) {
        clientGUI.amZug(schlag);
    }else {
        clientGUI.amZug();
    }
}