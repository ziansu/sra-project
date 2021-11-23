@java.lang.Override
public boolean add(final com.github.lecogiteur.csvbang.parser.CsvGrammarAction<?> word) throws com.github.lecogiteur.csvbang.exception.CsvBangException {
    if (word != null) {
        isTerminatedRecord = (isTerminatedRecord) || (word.isLastAction());
        switch (word.getType()) {
            case FIELD :
                fields.add(word);
                endOffset = word.getEndOffset();
                return true;
            case END :
                return true;
            default :
                return false;
        }
    }
    return true;
}