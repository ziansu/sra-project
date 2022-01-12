private com.individual.thinking.traitorstown.game.Effect createEffect(com.individual.thinking.traitorstown.game.EffectType type, com.individual.thinking.traitorstown.game.Effect effect) {
    java.util.Optional<com.individual.thinking.traitorstown.game.Effect> existingEffect = effectRepository.findByEffectType(type);
    if (existingEffect.isPresent()) {
        effectRepository.delete(existingEffect.get());
    }
    effectRepository.save(effect);
    com.individual.thinking.traitorstown.game.CardService.Effects.put(type, effect);
    return effect;
}