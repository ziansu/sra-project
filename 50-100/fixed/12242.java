void updateSymbols(java.lang.String prefix) {
    if ((mItems.size()) > 0)
        mItems.get(0).setEnabled(true);
    
    for (com.topodroid.DistoX.EnableSymbol symbol : mItems) {
        if (symbol.MustSave()) {
            symbol.mSymbol.setEnabled(symbol.mEnabled);
            TopoDroidApp.mData.setSymbolEnabled((prefix + (symbol.mSymbol.getThName())), symbol.mSymbol.isEnabled());
        }
    }
}