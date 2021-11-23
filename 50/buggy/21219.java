private void resumeCurrent() {
    currentStep().resume(context);
    state = PlayState.Playing;
}