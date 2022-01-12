public us.ihmc.graphicsDescription.instructions.CapsuleGraphics3DInstruction addCapsule(double radius, double height, us.ihmc.graphicsDescription.appearance.AppearanceDefinition capsuleAppearance) {
    us.ihmc.graphicsDescription.instructions.CapsuleGraphics3DInstruction capsuleInstruction = new us.ihmc.graphicsDescription.instructions.CapsuleGraphics3DInstruction((height - (2.0 * radius)), radius, radius, radius, us.ihmc.graphicsDescription.Graphics3DObject.CAPSULE_RESOLUTION);
    capsuleInstruction.setAppearance(capsuleAppearance);
    graphics3DInstructions.add(capsuleInstruction);
    return capsuleInstruction;
}