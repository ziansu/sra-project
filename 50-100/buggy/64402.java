private static void extractFile(java.util.zip.ZipInputStream in, java.io.File outdir, java.lang.String name) throws java.io.IOException {
    byte[] buffer = new byte[com.danimaniarqsoft.brain.util.ZipUtils.BUFFER_SIZE];
    java.io.BufferedOutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(outdir, name)));
    int count = -1;
    while ((count = in.read(buffer)) != (-1))
        out.write(buffer, 0, count);
    
    out.close();
}