public org.eclipse.swt.widgets.Button getButton(int Z) {
    if (Z < 1)
        throw new java.lang.ArrayIndexOutOfBoundsException();
    
    return periodicTableButtons.get(Z).getButton();
}