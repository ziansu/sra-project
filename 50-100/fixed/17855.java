public void addNewExperience(int addExperience) {
    if (((this.getExperience()) + addExperience) >= (this.getNextLevelExperience())) {
        int experienceToNextLevel = (this.getNextLevelExperience()) - (this.getExperience());
        this.setExperience((addExperience - experienceToNextLevel));
        this.setNewLevel(((this.getLevel()) + 1));
    }else {
        this.setExperience(((this.getExperience()) + addExperience));
    }
}