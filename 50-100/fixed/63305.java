public int getMaxThreads() {
    java.lang.String maxThreadsStr = getMatchValue(edu.cmu.ml.rtw.generic.parse.Obj.curlyBracedValue("maxThreads"));
    if (maxThreadsStr != null)
        return java.lang.Integer.valueOf(maxThreadsStr);
    
    if (((this.dataTools.getProperties()) != null) && ((this.dataTools.getProperties().getMaxThreads()) != null))
        return this.dataTools.getProperties().getMaxThreads();
    
    return 1;
}