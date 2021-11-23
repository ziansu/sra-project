private void Reset() throws java.lang.Exception {
    pipelineserver.stage.Var.Var.reset();
    Runnable = true;
    for (int i = 0; i < (codeLen); i++) {
        memory[i] = code[i];
    }
    Refresh();
}