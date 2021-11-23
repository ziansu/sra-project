public void readCam() {
    flyCam.Connect(frameRate);
    java.lang.System.out.println(("TILE: " + (flyCam.tile)));
    java.lang.System.out.println(flyCam.errn);
    flyCam.NextFrame(camBytes);
    java.lang.System.out.println(flyCam.errn);
    byteConvert();
}