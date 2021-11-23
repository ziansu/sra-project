@org.junit.Test
public void play() throws java.io.IOException {
    surrenderDvl = java.lang.ClassLoader.getSystemResource("Way_Out_West-Surrender-Eelke_Kleijn_Remix.dvl.xml");
    super.play(new no.lau.vdvil.timing.MasterBeatPattern(12, 20, 150.0F));
}