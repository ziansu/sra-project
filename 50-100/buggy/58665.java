private boolean alreadySpelt(BackEnd.Word word) {
    for (int i = 0; i < (currentU.getCorrectlySpelt().size()); i++) {
        if (word.getSpelling().equalsIgnoreCase(currentU.getCorrectlySpelt().get(i).getSpelling()))
            return true;
        
    }
    return false;
}