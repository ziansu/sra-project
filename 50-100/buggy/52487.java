public java.util.List<java.lang.String> extractAheadCommandSegments() {
    java.util.List<java.lang.String> aheadSegments = new java.util.ArrayList<java.lang.String>();
    if (org.talend.designer.runprocess.ProcessorUtilities.isExportConfig()) {
        if (isWinTargetPlatform()) {
            aheadSegments.add("%~d0\r\n");
            aheadSegments.add("cd %~dp0\r\n");
        }else {
            aheadSegments.add("cd `dirname $0`\n");
            aheadSegments.add("ROOT_PATH=`pwd`\n");
        }
    }
    return aheadSegments;
}