public static <O, T> com.google.android.material.motion.tweens.MaterialAnimator ofObject(O target, android.util.Property<O, T> property, android.animation.TypeEvaluator<T> evaluator, T... values) {
    return new com.google.android.material.motion.tweens.MaterialAnimator(new com.google.android.material.motion.interactions.Tween(target, property, evaluator, values, null, null, null, null, null));
}