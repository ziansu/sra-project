private java.io.File createPho(java.lang.String Target) throws java.io.FileNotFoundException {
    java.io.File pho = new java.io.File(Target);
    if (pho.exists()) {
        pho.delete();
    }
    java.io.PrintWriter out = new java.io.PrintWriter(pho);
    for (tts.core.phonemes.types.Word word : words) {
        for (tts.core.phonemes.types.Phoneme phoneme : word.getPhonemes()) {
            out.println(phoneme.toString());
            out.flush();
        }
    }
    out.close();
    return pho;
}