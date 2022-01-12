public java.lang.String setPupilShape(com.base.game.character.GameCharacter owner, com.base.game.character.body.valueEnums.EyeShape pupilShape) {
    if ((owner.getPupilShape()) == pupilShape) {
        return "<p style='text-align:center;'>[style.colourDisabled(Nothing happens...)]</p>";
    }
    this.pupilShape = pupilShape;
    if (owner.isPlayer()) {
        return com.base.game.dialogue.utils.UtilText.parse(owner, ("<p>" + (("An irritable itchy feeling rises up into your [pc.eyes], but, much to your relief, it passes even before you're able to reach up and rub at them.</br>" + "You now have [style.boldTfGeneric([pc.pupilShape] pupils)]!") + "</p>")));
    }else {
        return com.base.game.dialogue.utils.UtilText.parse(owner, ("<p>" + (("An irritable itchy feeling rises up into [npc.name]'s [npc.eyes], but, much to [npc.her] relief, it passes even before [npc.she]'s able to reach up and rub at them.</br>" + "[npc.Name] now has [style.boldTfGeneric([npc.pupilShape] pupils)]!") + "</p>")));
    }
}