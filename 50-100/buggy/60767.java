@java.lang.Override
public void run() {
    for (int i = 0; i < ((screen.WhiteRavenLauncher.CPU_CYCLES_PER_SECOND) / 60); i++) {
        console.cpu.executeCycle();
        if (console.ppu.triggerVerticalBlank) {
            console.cpu.triggerInterrupt(nes.Interrupt.NMI);
            console.ppu.triggerVerticalBlank = false;
            if (console.ppu.imageReady) {
                screen.push(console.ppu.getImage());
                screen.redraw();
            }
        }
        console.ppu.executeCycles(3);
    }
}