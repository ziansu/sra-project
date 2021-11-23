public void apply(com.gmail.uprial.customcreatures.common.CustomLogger customLogger, org.bukkit.entity.LivingEntity entity) {
    for (com.gmail.uprial.customcreatures.schema.IPotionEffectTypesEnum effectType : effectTypes) {
        addEffect(customLogger, entity, new org.bukkit.potion.PotionEffect(effectType.getType(), com.gmail.uprial.customcreatures.common.Utils.seconds2ticks(duration.getValue()), ((strength.getValue()) - 1)));
    }
}