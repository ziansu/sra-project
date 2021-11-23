java.io.File getXFigInTexFile(org.m2latex.core.TexFileUtils fileUtils, java.io.File srcFile) {
    return fileUtils.replaceSuffix(srcFile, LatexPreProcessor.SUFFIX_PDF);
}