public int synthesis(java.io.FileOutputStream wavf, java.io.FileOutputStream logf) {
    if ((jpcommon) == null)
        return -1;
    
    int result = 0;
    if ((jpcommon.get_label_size()) > 2) {
        java.lang.System.nanoTime();
        if ((engine.synthesize_from_strings(jpcommon.get_label_feature())) == true) {
            result = 1;
        }
        if (wavf != null)
            save_riff(wavf);
        
        if (logf != null) {
            save_information(logf);
        }
    }
    return result;
}