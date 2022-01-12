public void convertAndPlayWav() {
    java.lang.System.out.println("\nconverting hex to wav\n");
    try {
        wavCreator.WavCodeGenerator wg = new wavCreator.WavCodeGenerator();
        wg.setSignalSpeed(true);
        wg.convertHex2Wav(setupData.getInputHexFile(), setupData.getOutputWavFile());
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    java.lang.System.out.println("done\n");
    java.lang.System.out.println("playing wav-file\n");
    new waveFile.AePlayWave(setupData.getOutputWavFile().toString()).start();
}