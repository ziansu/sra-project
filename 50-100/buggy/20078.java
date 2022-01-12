public int getLineCount(int lineNumber) {
    try {
        int pos = lineNumber << 2;
        if (pos >= (size)) {
            return 0;
        }else {
            file.seek(pos);
            int count = file.readInt();
            if (count == (com.cakupan.xslt.data.CoverageIndex.NOT_A_LINE)) {
                return 0;
            }
            return count;
        }
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}