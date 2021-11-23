public void clean() {
    if (success) {
        if (unzipedFilePath.equals(zippedFilePath.substring(0, ((zippedFilePath.length()) - 4)))) {
            for (java.io.File c : outputDir.listFiles()) {
                if (!(c.delete())) {
                    java.lang.System.out.println(("failed to delete" + (c.toString())));
                }
            }
            outputDir.delete();
            outputDir = null;
        }
    }
}