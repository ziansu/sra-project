@com.atlauncher.annot.Subscribe
public void onRelocalization(com.atlauncher.evnt.EventHandler.RelocalizationEvent e) {
    copy.setText(com.atlauncher.managers.LanguageManager.localize("common.copy"));
}