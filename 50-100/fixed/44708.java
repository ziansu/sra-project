public void setFocus(boolean focus) {
    switch (state) {
        case autoCompleteTextField :
            ((geogebra.html5.gui.inputfield.AutoCompleteTextFieldW) (field)).setFocus(focus);
            break;
        case radioButtonTreeItem :
            ((geogebra.web.gui.view.algebra.NewRadioButtonTreeItem) (field)).setFocus(true);
            break;
    }
}