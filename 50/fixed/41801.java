void setPlusToAllSkills() {
    if ((generateRandomNumber()) > 60)
        this.plusToAllSkills = 1;
    else
        if ((generateRandomNumber()) > 80)
            this.plusToAllSkills = 2;
        else
            this.plusToAllSkills = 0;
        
    
}