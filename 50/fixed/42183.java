@java.lang.Override
public void markRecordStart() {
    tmp.reset();
    recordStart = ((i) <= 0) ? 0 : (i) - 1;
}