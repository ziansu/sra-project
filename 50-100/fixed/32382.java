public static void appendBytes(org.apache.hadoop.fs.FileSystem fs, java.lang.String filepath, byte[] bytes, int start, int length) {
    try {
        core.utils.FSDataOutputStream fout = fs.append(new core.utils.Path(filepath));
        fout.write(bytes, start, length);
        fout.close();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Could not append to file: " + filepath));
    }
}