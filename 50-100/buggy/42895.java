private microbat.model.BreakPointValue extractValuesAtLocation(microbat.model.BreakPoint bkp, com.sun.jdi.ThreadReference thread, com.sun.jdi.Location loc) throws sav.common.core.SavException {
    if (microbat.util.Settings.isRecordSnapshot) {
        try {
            microbat.codeanalysis.runtime.variable.VariableValueExtractor extractor = new microbat.codeanalysis.runtime.variable.VariableValueExtractor(bkp, thread, loc);
            microbat.model.BreakPointValue bpValue = extractor.extractValue();
            return bpValue;
        } catch (com.sun.jdi.IncompatibleThreadStateException e) {
            e.printStackTrace();
        } catch (com.sun.jdi.AbsentInformationException e) {
            e.printStackTrace();
        }
        return null;
    }else {
        return new microbat.model.BreakPointValue("");
    }
}