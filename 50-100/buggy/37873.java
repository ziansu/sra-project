@java.lang.Override
public void showView() {
    loadCombos();
    view.getFechaAutorizacion().setDate(new java.util.Date());
    view.getTxtProfesionalSolicitante().setText("");
    view.getTxtNumero().setText("");
    view.getCantPracticas().setValue(1);
    setComponentStyle(view.getTxtProfesionalSolicitante(), Styles.NORMAL);
    view.setVisible(true);
}