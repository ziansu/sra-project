public void addExperience(long experienceToAdd) {
    this.experience += experienceToAdd;
    for (br.ufrgs.dunjeonsdragons.template.ExperienceTableEntry entry : experienceTable) {
        if (((this.experience) >= (entry.getExperience())) && ((this.level) < (entry.getLevel()))) {
            this.level = ((int) (entry.getLevel()));
        }
    }
}