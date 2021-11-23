private void Reset(boolean transmit) throws java.lang.Exception {
    pipelineserver.stage.Var.Var.reset();
    Runnable = true;
    for (int i = 0; i < (codeLen); i++) {
        memory[i] = code[i];
    }
    if (transmit) {
        Refresh();
    }
}