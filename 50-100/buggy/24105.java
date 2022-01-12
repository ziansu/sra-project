@java.lang.Override
public java.lang.String getFileNameAt(int position) {
    java.util.Iterator iterator = mImportFiles.entrySet().iterator();
    int count = 0;
    while (iterator.hasNext()) {
        if (count == position) {
            java.util.Map.Entry<java.lang.String, java.lang.String> entry = ((java.util.Map.Entry<java.lang.String, java.lang.String>) (iterator.next()));
            return entry.getValue();
        }else {
            count++;
        }
    } 
    return null;
}