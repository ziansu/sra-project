public void saveState() {
    nachos.vm.Processor processor = nachos.vm.Machine.processor();
    nachos.vm.TranslationEntry TLBEntry;
    int vpn;
    for (int i = 0; i < (processor.getTLBSize()); i++) {
        TLBEntry = processor.readTLBEntry(i);
        vpn = TLBEntry.vpn;
        pageTable[vpn] = new nachos.vm.TranslationEntry(TLBEntry);
        TLBEntry.valid = false;
    }
}