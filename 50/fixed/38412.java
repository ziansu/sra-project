public hackattackfx.CPUUpgrade buildCPUUpgrade(hackattackfx.CPUUpgrade cpu) throws hackattackfx.NotEnoughBitcoinsException {
    this.removeBitcoins(cpu.getCost());
    modules.add(cpu);
    return cpu;
}