protected void updateTorchAge(long worldTime) {
    if ((worldTime > 0) && ((timeCreated) > worldTime))
        torchAge = worldTime - (timeCreated);
    
}