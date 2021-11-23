@java.lang.Override
public org.springframework.ide.eclipse.boot.properties.editor.reconciling.DocumentRegion subSequence(int start, int end) {
    int len = length();
    org.eclipse.core.runtime.Assert.isLegal((start >= 0));
    org.eclipse.core.runtime.Assert.isLegal((end <= len));
    if ((start == 0) && (end == len)) {
        return this;
    }
    return new org.springframework.ide.eclipse.boot.properties.editor.reconciling.DocumentRegion(doc, ((this.start) + start), ((this.start) + end));
}