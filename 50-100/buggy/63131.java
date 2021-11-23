private void cmbPriceFilterActionPerformed(java.awt.event.ActionEvent evt) {
    if (doneInit) {
        prFltrSelected = cmbPriceFilter.getSelectedIndex();
        if ((prFltrSelected) == (-1))
            return ;
        
        if ((prFltrSelected) == 0)
            spnPriceFilter.setEnabled(false);
        else {
            spnPriceFilter.setEnabled(true);
            fltrPrice = ((java.lang.Float) (spnPriceFilter.getValue()));
            if ((fltrPrice) > 0)
                applyFilter();
            
        }
    }
}