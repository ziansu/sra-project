@java.lang.Override
public void release() {
    try {
        reOpen(metadata);
    } catch (java.io.IOException e) {
        com.orientechnologies.common.log.OLogManager.instance().error(this, "Error on releasing Lucene index", e);
    }
}