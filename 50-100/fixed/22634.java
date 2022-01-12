private void updateSuggestion() {
    if ((matchedBoards.isEmpty()) || (((matchedBoards.size()) == (boards.size())) && ((boards.size()) != 1))) {
        suggestion = java.util.Optional.empty();
    }else {
        suggestion = matchedBoards.stream().min(java.lang.String::compareToIgnoreCase);
    }
}