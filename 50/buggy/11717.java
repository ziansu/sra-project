@java.lang.Override
public void onClick(android.view.View v) {
    selectedSkill = EnumFile.SkillsEnum.PUNCH;
    showTargets(checkSkillTime());
    android.util.Log.d(askim.eratactics.activities.TacticsGame.TAG, "Punch clicked");
}