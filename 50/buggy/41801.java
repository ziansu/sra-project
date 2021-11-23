void setPlusToAllSkills() {
    if ((Items.Item.generateRandomNumber()) > 60)
        this.plusToAllSkills = 1;
    else
        if ((Items.Item.generateRandomNumber()) > 80)
            this.plusToAllSkills = 2;
        else
            this.plusToAllSkills = 0;
        
    
}