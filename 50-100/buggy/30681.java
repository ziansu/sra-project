@java.lang.Override
public void onFlexOfferScheduleUpdate(org.arrowhead.wp5.core.entities.FlexOffer fo) {
    if (((fo.getFlexOfferSchedule()) != null) && (!(httpClients.contains(fo.getOfferedById())))) {
        try {
            xFOProvider.setSubscriberId(fo.getOfferedById());
            xFOProvider.createFlexOfferSchedule(fo.getId(), fo.getFlexOfferSchedule());
        } catch (org.arrowhead.wp5.core.entities.FlexOfferException e) {
            e.printStackTrace();
        }
    }
}