public void setup() {
    pg = createGraphics(main.Main.ResX, main.Main.ResY);
    background(backgroundcolor);
    minim = new ddf.minim.Minim(this);
    player1 = ((ddf.minim.Minim) (minim)).loadFile("src/data/aphex.mp3", 2048);
    player1.loop();
    main.Main.fft = new ddf.minim.analysis.FFT(player1.bufferSize(), player1.sampleRate());
}