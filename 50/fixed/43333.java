private static int methodWaitTillDone(int srcNames, java.nio.IntBuffer audioState) {
    alGetSourcei(srcNames, io.github.subiyacryolite.enginev1.AL_SOURCE_STATE, audioState);
    return audioState.get(0);
}