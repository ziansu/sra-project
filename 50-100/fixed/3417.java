public void addExperience(int experience) {
    universe.text_handler.createDecayText((("+" + experience) + "xp"), universe.screen.gui.bar_experience.x, ((universe.screen.gui.bar_experience.y) + (universe.screen.gui.bar_experience.MAX_BAR_HEIGHT)), Color.YELLOW);
    this.experience_current += experience;
    while ((this.experience_current) >= (EXPERIENCE_MAX)) {
        levelUp();
        this.experience_current -= EXPERIENCE_MAX;
    } 
}