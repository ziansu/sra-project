public static void applyIdentity(net.sf.mzmine.datamodel.PeakList peaklist, net.sf.mzmine.modules.peaklistmethods.normalization.rtadjuster.JDXCompound identity, int rowId, double score, boolean canTagAsRef) {
    for (int i = 0; i < (peaklist.getNumberOfRows()); ++i) {
        net.sf.mzmine.datamodel.PeakListRow a_pl_row = peaklist.getRows()[i];
        net.sf.mzmine.modules.peaklistmethods.identification.customjdxsearch.CustomJDXSearchTask.applyRowIdentity(a_pl_row, identity, rowId, score, canTagAsRef);
    }
}