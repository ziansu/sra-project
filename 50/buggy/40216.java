@java.lang.Override
public void onExperienceChanged(Lesser_alpha.LAWoodcutter.utils.Listeners.Experience.ExperienceEvent e) {
    expGain += e.getExperienceChange();
    setLogsChopped(((getLogsChopped()) + 1));
    java.lang.System.out.printf("Skill Index: %d | Experience Change %d\n", e.getSkillIndex(), e.getExperienceChange());
}