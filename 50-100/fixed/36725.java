public double getLocalMaximumNeededWidth() {
    if ((localMaxNeededWidth) == (info.bioinfweb.libralign.alignmentarea.label.AlignmentLabelArea.RECALCULATE_VALUE)) {
        localMaxNeededWidth = 0;
        java.util.Iterator<info.bioinfweb.libralign.alignmentarea.label.AlignmentLabelSubArea> iterator = subAreaIterator();
        while (iterator.hasNext()) {
            localMaxNeededWidth = java.lang.Math.max(localMaxNeededWidth, iterator.next().getNeededWidth());
        } 
    }
    return localMaxNeededWidth;
}