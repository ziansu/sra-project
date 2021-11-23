public void ReInit(lsf.zuba.javacc.SimpleCharStream stream, int lexState) {
    ReInit(stream);
    SwitchTo(lexState);
}