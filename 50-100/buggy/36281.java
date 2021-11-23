public static byui.cit260.darkdungeon.control.CharacterSelection createPaladin() {
    byui.cit260.darkdungeon.control.CharacterSelection[] fighter = new byui.cit260.darkdungeon.control.CharacterSelection[byui.cit260.darkdungeon.enums.Actor.values().length];
    byui.cit260.darkdungeon.control.CharacterSelection paladin = new byui.cit260.darkdungeon.control.CharacterSelection();
    byui.cit260.darkdungeon.control.GameControl.warrior = new byui.cit260.darkdungeon.control.CharacterSelection("The Might Paladin Defender -", "- Brave defender of the people for all that is good.", 120, 20, 40, 10, 30, 40, 60, true);
    byui.cit260.darkdungeon.control.GameControl.game.setWarrior(byui.cit260.darkdungeon.control.GameControl.warrior);
    fighter[CharacterSelection.Actor.paladin.ordinal()] = paladin;
    return byui.cit260.darkdungeon.control.GameControl.warrior;
}