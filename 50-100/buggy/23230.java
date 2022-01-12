private void invalidateVictimPage(int ppn) {
    for (int i = 0; i < (nachos.vm.Machine.processor().getTLBSize()); i++) {
        nachos.vm.TranslationEntry tlbe = nachos.vm.Machine.processor().readTLBEntry(i);
        if (tlbe.ppn = ppn) {
            tlbe.valid = false;
            pageTable[tlbe.vpn].valid = false;
        }
    }
}