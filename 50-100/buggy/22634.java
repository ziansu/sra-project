private void updateSuggestion() {
    if ((matchedBoards.isEmpty()) || ((matchedBoards.size()) == (boards.size()))) {
        suggestion = java.util.Optional.empty();
    }else {
        suggestion = matchedBoards.stream().min(java.lang.String::compareToIgnoreCase);
    }
}