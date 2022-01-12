@java.lang.Override
public int compare(fi.nls.fileservice.dataset.DatasetVersion dv1, fi.nls.fileservice.dataset.DatasetVersion dv2) {
    if ((dv2.getLastModified()) != null) {
        if ((dv1.getLastModified()) != null) {
            return dv2.getLastModified().compareTo(dv1.getLastModified());
        }
        return 1;
    }else
        if ((dv1.getLastModified()) != null) {
            return 1;
        }
    
    return 0;
}