public void lowerSkill(short skillLevel) {
    if (((skillLevel + (this.skillLevel)) <= (com.gpteam.shopmanager.Variables.Variables.MAX_SKILL_LEVEL)) && ((skillLevel + (this.skillLevel)) >= (com.gpteam.shopmanager.Variables.Variables.MIN_SKILL_LEVEL)))
        this.skillLevel -= skillLevel;
    else
        com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler.handleIllegalArgumentException("MSG");
    
}