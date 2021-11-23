public void disengage() {
    current = com.linxonline.mallet.ui.UIElement.State.NEUTRAL;
    final java.util.List<com.linxonline.mallet.ui.IBase<? extends com.linxonline.mallet.ui.UIElement>> base = listeners.getListeners();
    final int size = base.size();
    for (int i = 0; i < size; i++) {
        base.get(i).disengage();
    }
}