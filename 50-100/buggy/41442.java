public void setExp(float percentToLevel) {
    int baseXp = (getLevel()) * 7;
    assert baseXp < (experience);
    float xpToLevel = ((getLevel()) + 1) * 7;
    experience = baseXp + ((int) (percentToLevel * xpToLevel));
    updateLevel();
    session.send(createExperienceMessage());
}