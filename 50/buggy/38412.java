public hackattackfx.CPUUpgrade buildCPUUpgrade(hackattackfx.CPUUpgrade cpu) throws hackattackfx.NotEnoughBitcoinsException {
    modules.add(cpu);
    this.removeBitcoins(cpu.getCost());
    return cpu;
}