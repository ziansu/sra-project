private void output(java.io.File intermediate) throws java.io.IOException {
    if ((fArguments.size()) >= 3) {
        java.io.File output = new java.io.File(fArguments.get(2));
        intermediate.renameTo(output);
    }
    try (java.io.FileInputStream iStream = new java.io.FileInputStream(intermediate)) {
        org.apache.commons.io.IOUtils.copy(iStream, java.lang.System.out);
    } finally {
        intermediate.delete();
    }
}