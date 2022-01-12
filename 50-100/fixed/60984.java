@java.lang.Override
public void setSourcePath(java.util.List<gw.fs.IDirectory> sourcePaths) {
    java.util.List<gw.fs.IDirectory> sources = new java.util.ArrayList<>();
    sources.addAll(getAdditionalSourceRoots());
    sources.addAll(sourcePaths);
    _fileRepository.setSourcePath(sources.toArray(new gw.fs.IDirectory[sourcePaths.size()]));
}