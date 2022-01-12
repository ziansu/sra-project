public magic.model.MagicManaCost modCost(final magic.model.MagicCard card, final magic.model.MagicManaCost cost) {
    magic.model.MagicManaCost currCost = cost;
    for (final magic.model.mstatic.MagicPermanentStatic mps : getStatics(MagicLayer.CostIncrease)) {
        currCost = mps.getStatic().increaseCost(mps.getPermanent(), card, currCost);
    }
    for (final magic.model.mstatic.MagicPermanentStatic mps : getStatics(MagicLayer.CostReduction)) {
        currCost = mps.getStatic().reduceCost(mps.getPermanent(), card, currCost);
    }
    return currCost;
}