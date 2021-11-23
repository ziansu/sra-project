private void resumeCurrent() {
    state = PlayState.Playing;
    currentStep().resume(context);
}