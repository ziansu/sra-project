@java.lang.Override
public translator.TranslatedEntry getNextEntryToTranslateAndSetLoanWord(translator.TranslatedEntry loanWordEntry) {
    java.lang.String filename = mains.Diagnostic.acceptedLoanwordFile;
    java.io.FileWriter fw = null;
    try {
        fw = new java.io.FileWriter(filename, true);
        fw.write(("\n" + (loanWordEntry.getSource())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (fw != null)
                fw.close();
            
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return getNextEntryToTranslate();
}