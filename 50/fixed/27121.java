private static void applyChanges(@android.support.annotation.Nullable
final java.util.List<net.gini.android.vision.internal.camera.photo.PhotoModifier> modifiers) {
    if (modifiers == null) {
        return ;
    }
    for (final net.gini.android.vision.internal.camera.photo.PhotoModifier modifier : modifiers) {
        modifier.modify();
    }
}