public int generateInt(oortcloud.hungryanimals.entities.capability.ICapabilityHungryAnimal cap) {
    float x = ((float) ((cap.getHunger()) / (cap.getMaxHunger())));
    return net.minecraft.util.math.MathHelper.floor_float((((((this.max) + 1) - (this.min)) * x) + (this.min)));
}