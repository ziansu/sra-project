public void executePeptideOperations() {
    piaModeller.setCreatePSMSets(getSettingBoolean(PIASettings.CREATE_PSMSETS));
    piaModeller.setConsiderModifications(getSettingBoolean(PIASettings.CONSIDER_MODIFICATIONS));
    piaModeller.getPeptideModeller().removeAllFilters();
    java.lang.Long fileID = getSettingInteger(PIASettings.PEPTIDE_ANALYSIS_FILE_ID).longValue();
    java.lang.String[] serializedInferenceFilters = getSettingStringArray(PIASettings.PEPTIDE_FILTERS);
    for (de.mpc.pia.modeller.report.filter.AbstractFilter filter : de.mpc.pia.knime.nodes.PIAAnalysisModel.unserializeFilters(serializedInferenceFilters)) {
        piaModeller.getPeptideModeller().addFilter(fileID, filter);
    }
}