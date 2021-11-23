public java.util.List<org.apache.mesos.offer.OfferRecommendation> evaluate(org.apache.mesos.offer.OfferRequirement offerRequirement, java.util.List<org.apache.mesos.Protos.Offer> offers) {
    for (org.apache.mesos.Protos.Offer offer : offers) {
        java.util.List<org.apache.mesos.offer.OfferRecommendation> recommendations = evaluate(offerRequirement, offer);
        if ((recommendations != null) && (!(recommendations.isEmpty()))) {
            return recommendations;
        }
    }
    return java.util.Collections.emptyList();
}