@java.lang.Override
public int compareTo(eu.transkribus.core.model.beans.TrpDocMetadata md) {
    if ((this.getDocId()) > (md.getDocId())) {
        return 1;
    }
    if ((this.getDocId()) < (md.getDocId())) {
        return -1;
    }
    return 0;
}