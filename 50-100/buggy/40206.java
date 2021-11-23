public void resolvePreAttackSkills(cfvbaibai.cardfantasy.engine.Player attacker, cfvbaibai.cardfantasy.engine.Player defender) throws cfvbaibai.cardfantasy.engine.HeroDieSignal {
    java.util.List<cfvbaibai.cardfantasy.engine.CardInfo> cards = attacker.getField().getAliveCards();
    for (cfvbaibai.cardfantasy.engine.CardInfo card : cards) {
        if (card.isFullyControlled()) {
            continue;
        }
        for (cfvbaibai.cardfantasy.engine.SkillUseInfo skillUseInfo : card.getNormalUsableSkills()) {
            if ((skillUseInfo.getType()) == (cfvbaibai.cardfantasy.data.SkillType.神性祈求)) {
                cfvbaibai.cardfantasy.engine.skill.Purify.apply(skillUseInfo, this, card);
            }
        }
    }
}