@java.lang.Override
protected java.lang.String load() {
    java.lang.StringBuffer fileName = new java.lang.StringBuffer();
    fileName.append(this.getModelObject().project.getName());
    fileName.append("_curated_documents_");
    java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyy-MM-dd_HHmm");
    fileName.append(fmt.format(new java.util.Date()));
    fileName.append(".zip");
    return fileName.toString();
}