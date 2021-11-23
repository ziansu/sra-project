@java.lang.Override
public boolean add(final com.github.lecogiteur.csvbang.parser.CsvGrammarAction<?> word) throws com.github.lecogiteur.csvbang.exception.CsvBangException {
    if (word != null) {
        switch (word.getType()) {
            case FIELD :
                fields.add(word);
                endOffset = word.getEndOffset();
                isTerminatedRecord = (isTerminatedRecord) || (word.isLastAction());
                return true;
            case END :
                isTerminatedRecord = (isTerminatedRecord) || (word.isLastAction());
                return true;
            default :
                return false;
        }
    }
    return true;
}