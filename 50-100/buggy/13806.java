public static java.lang.String getFastestDevice(clearcl.backend.ClearCLBackendInterface pClearCLBackend, clearcl.enums.BenchmarkTest pBenchmarkTest, int pRepeats) {
    try (clearcl.ClearCL lClearCL = new clearcl.ClearCL(pClearCLBackend)) {
        clearcl.ClearCLDevice lFastestDevice = clearcl.benchmark.Benchmark.getFastestDevice(lClearCL.getAllDevices(), pBenchmarkTest, pRepeats);
        lClearCL.close();
        return lFastestDevice.toString();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        return null;
    }
}