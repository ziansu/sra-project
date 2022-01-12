static com.solera.defrag.ViewStack.SaveState newInstance(@android.support.annotation.NonNull
com.solera.defrag.ViewStack viewstack, @android.support.annotation.NonNull
android.os.Parcelable superState) {
    java.util.List<com.solera.defrag.ViewStack.SaveStateEntry> stack = new java.util.ArrayList<>(viewstack.getViewCount());
    for (com.solera.defrag.ViewStack.ViewStackEntry entry : viewstack.viewStack) {
        stack.add(com.solera.defrag.ViewStack.SaveStateEntry.newInstance(entry.mLayout, entry.mParameters, entry.mViewState));
    }
    return new com.solera.defrag.AutoValue_ViewStack_SaveState(stack, superState);
}