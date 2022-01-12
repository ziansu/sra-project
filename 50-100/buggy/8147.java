private void fillDefaultAttack() {
    java.lang.String skillName = "Tackle";
    skillPower[0] = 1;
    skillAgility[0] = 1;
    skillSpeed[0] = 1;
    android.widget.Button defaultSkill = ((android.widget.Button) (findViewById(R.id.skill0)));
    setButtonText(skillName, skillPower[0], skillAgility[0], skillSpeed[0], defaultSkill);
}