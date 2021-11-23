public java.lang.String getMessageForTaskListShownSummaryIfExactPhraseNotFound() {
    java.lang.String MESSAGE_IF_EXACT_PHRASE_NOT_FOUND = ("The exact phrase '" + (keywords)) + "' was not found. Listing all tasks containing the keywords entered instead.";
    return java.lang.String.format(MESSAGE_IF_EXACT_PHRASE_NOT_FOUND);
}