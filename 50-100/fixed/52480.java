public void switchLabel() {
    if (tep.isActive()) {
        tep.switchActive();
        cep.switchActive();
        tep.setVisible(false);
        cep.setVisible(true);
    }else
        if (cep.isActive()) {
            tep.switchActive();
            cep.switchActive();
            cep.setVisible(false);
            tep.setVisible(true);
        }
    
}