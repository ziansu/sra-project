public void addExperience(long experienceToAdd) {
    this.experience += experienceToAdd;
    for (br.ufrgs.dunjeonsdragons.template.ExperienceTableEntry entry : experienceTable) {
        if (((entry.getExperience()) >= (this.experience)) && ((this.level) < (entry.getLevel()))) {
            this.level = ((int) (entry.getLevel()));
        }
    }
}