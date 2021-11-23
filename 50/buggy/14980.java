public static e.emjinter.source.SourceStream FromFile(java.lang.String filename) throws e.emjinter.source.EmjInterExceptionBase {
    java.lang.String contents = e.emjinter.source.SourceLoader.Load(filename);
    return new e.emjinter.source.SourceStream(contents);
}