@java.lang.Override
public void validate(java.lang.Object o, org.springframework.validation.Errors errors) {
    etu.upmc.fr.entity.Service s = ((etu.upmc.fr.entity.Service) (o));
    if (s.getBiddingDeadline().after(s.getServiceDeadline())) {
        errors.rejectValue("biddingDeadline", "futureDate", new java.lang.Object[]{ "biddingDeadline" }, "La fin des candidatures ne peut pas dépasser la limite de livraison");
    }
}