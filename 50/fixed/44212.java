public org.eclipse.swt.widgets.Button getButton(java.lang.String element) {
    int Z = org.dawnsci.common.widgets.periodictable.PeriodicTableComposite.SymbolToAtomicNumber(element);
    if (Z < 1)
        throw new java.lang.ArrayIndexOutOfBoundsException();
    
    return periodicTableButtons[Z].getButton();
}