public mage.game.stack.Spell copySpell() {
    return new mage.game.stack.Spell(this.card, this.ability.copySpell(), this.controllerId, this.fromZone);
}