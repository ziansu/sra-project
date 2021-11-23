@java.lang.Override
public void show() {
    super.show();
    if ((screen_level_store) != null) {
        gui.spell_number_unlocked = ((com.leepresswood.wizard.screens.levelstore.gui.SpellLevelUpGUIButton) (screen_level_store.button_array[0])).current;
        gui.refreshSpellList();
    }
}