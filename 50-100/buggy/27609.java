private boolean assemble() {
    Assembly asm = Import.importInstructions(textArea.getText());
    Memory.clean();
    Memory.setMemory(asm.assemble());
    Registers.init_Memory();
    Memory.instrToString();
    java.lang.System.out.println();
    enableButtons();
    updateGUI();
    return true;
}