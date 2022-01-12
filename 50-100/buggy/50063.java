private void removeSpeedBuff(net.minecraft.entity.EntityLivingBase entityLivingBase, int enchantmentLevel) {
    net.minecraft.entity.ai.attributes.IAttributeInstance speedAttribute = entityLivingBase.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.movementSpeed);
    if ((speedAttribute.getModifier(io.github.anon10w1z.craftPP.enchantments.EnchantmentNimble.nimbleUUID)) != null) {
        net.minecraft.entity.ai.attributes.AttributeModifier speedModifier = new net.minecraft.entity.ai.attributes.AttributeModifier(io.github.anon10w1z.craftPP.enchantments.EnchantmentNimble.nimbleUUID, "NimbleBoots", ((((float) (1)) / 5) * enchantmentLevel), 1);
        speedAttribute.removeModifier(speedModifier);
    }
}