@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    if (isReadyToCommit(tabType, otherfg)) {
        if (commit(cPlaceholder)) {
            com.vaadin.ui.ComboBox comboAllFCOperators = null;
            com.vaadin.ui.ComboBox comboTT = null;
            if (isCommission) {
                comboAllFCOperators = comboAllCommissionOperators;
                comboTT = comboCommissionsTT;
            }else {
                comboAllFCOperators = comboAllFeesOperators;
                comboTT = comboFeesTT;
            }
            comboAllFCOperators.select(null);
            comboTT.setVisible(false);
            if (isCommission) {
                return ;
            }
        }
        return ;
    }else {
        return ;
    }
}