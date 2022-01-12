public io.github.manami.dto.entities.Recommendation addRecommendation(final io.github.manami.dto.entities.Recommendation recommendation) {
    final io.github.manami.dto.entities.Recommendation value = recommendation;
    if (recommendations.containsKey(recommendation.getInfoLink())) {
        final int amountInList = recommendations.get(recommendation.getInfoLink()).getAmount();
        final int newAmount = value.getAmount();
        value.setAmount((amountInList + newAmount));
    }
    return recommendations.put(recommendation.getInfoLink(), value);
}