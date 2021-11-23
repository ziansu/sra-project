private static void applyChanges(@android.support.annotation.NonNull
final java.util.List<net.gini.android.vision.internal.camera.photo.PhotoModifier> modifiers) {
    for (final net.gini.android.vision.internal.camera.photo.PhotoModifier modifier : modifiers) {
        modifier.modify();
    }
}