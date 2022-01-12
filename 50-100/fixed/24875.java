public com.eldad.memorygame.GameCard CreateIfNotExists(android.widget.ImageView imageViewCovered, android.widget.ImageView imageViewUnCovered, java.lang.Integer imageToDisplayResource) {
    if (!(_mapping.containsKey(imageViewCovered))) {
        com.eldad.memorygame.GameCard gameCard = new com.eldad.memorygame.GameCard(imageViewCovered, imageViewUnCovered, imageToDisplayResource);
        _mapping.put(imageViewCovered, gameCard);
    }
    return _mapping.get(imageViewCovered);
}