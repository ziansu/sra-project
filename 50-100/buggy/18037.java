private void storeCurrFlame() {
    if ((currFlame) != null) {
        try {
            java.lang.String filename = qsaveFilenameGen.generateFilename("jwf_ir_current.flame");
            new org.jwildfire.create.tina.io.FlameWriter().writeFlame(currFlame, filename);
        } catch (java.lang.Exception ex) {
            errorHandler.handleError(ex);
        }
    }
}