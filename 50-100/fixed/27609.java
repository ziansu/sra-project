private boolean assemble() {
    Assembly asm = Import.importInstructions(textArea.getText());
    Memory.clean();
    Registers.init_Memory();
    Memory.setMemory(asm.assemble());
    Memory.instrToString();
    java.lang.System.out.println();
    enableButtons();
    updateGUI();
    return true;
}