public static float[] shiftSound(double[] data, double factor) {
    float[] indata = cs4347group10.cs4347application.Libraries.DspLib.doubleToFloat(data);
    float[] outdata = new float[data.length];
    cs4347group10.cs4347application.Libraries.PitchShifter ps = new cs4347group10.cs4347application.Libraries.PitchShifter(1024);
    ps.setFftFrameSize(1024);
    ps.setOversampling(32);
    ps.setSampleRate(44100);
    ps.setPitchShift(factor);
    ps.smbPitchShift(indata, outdata, 0, 44100);
    return outdata;
}