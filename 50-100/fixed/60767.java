@java.lang.Override
public void run() {
    for (int i = 0; i < ((screen.WhiteRavenLauncher.CPU_CYCLES_PER_SECOND) / 60); i++) {
        console.ppu.executeCycles(3);
        console.cpu.executeCycle();
        if (console.ppu.triggerVerticalBlank) {
            console.cpu.triggerInterrupt(nes.Interrupt.NMI);
            screen.push(console.ppu.getImage());
            console.ppu.triggerVerticalBlank = false;
        }
        screen.redraw();
    }
}