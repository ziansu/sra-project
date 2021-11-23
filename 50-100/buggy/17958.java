public static java.util.List<com.fkeglevich.rawdumper.camera.CaptureSize> convertSizeList(java.util.List<android.hardware.Camera.Size> list) {
    java.util.List<com.fkeglevich.rawdumper.camera.CaptureSize> result = new java.util.ArrayList<com.fkeglevich.rawdumper.camera.CaptureSize>();
    for (android.hardware.Camera.Size size : list)
        result.add(com.fkeglevich.rawdumper.camera.helper.ParameterHelper.toCaptureSize(size));
    
    return result;
}