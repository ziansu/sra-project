private void makeEffects() {
    final it.unibo.alchemist.boundary.gui.effects.JEffectsTab<T> effects = new it.unibo.alchemist.boundary.gui.effects.JEffectsTab(main, true);
    if ((effectsTab) != null) {
        bar.deregisterTab(effectsTab);
        effects.setEffects(effectsTab.getEffects());
        effects.setEnabled(effectsTab.isEnabled());
    }else {
        effects.setEnabled(false);
    }
    effectsTab = effects;
    bar.registerTab(effectsTab);
}