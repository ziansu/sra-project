@java.lang.Override
public void onExperienceChanged(Lesser_alpha.LAWoodcutter.utils.Listeners.Experience.ExperienceEvent e) {
    expGain += e.getExperienceChange();
    setLogsChopped(((getLogsChopped()) + 1));
}