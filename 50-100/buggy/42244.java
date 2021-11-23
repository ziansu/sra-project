@java.lang.Override
protected java.lang.String load() {
    java.lang.StringBuffer _fileName = new java.lang.StringBuffer();
    _fileName.append(this.getModelObject().project.getName());
    _fileName.append("_curated_documents_");
    java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy-MM-dd_HHmm");
    _fileName.append(fmt.format(new java.util.Date()));
    _fileName.append(".zip");
    return _fileName.toString();
}