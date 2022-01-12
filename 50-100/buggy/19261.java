@java.lang.Override
public void validate(java.lang.Object o, org.springframework.validation.Errors errors) {
    ua.com.javer.flowerexpert.entity.UserChoice userChoice = ((ua.com.javer.flowerexpert.entity.UserChoice) (o));
    if ((userChoice.getLowPrice().getPriceCents()) < (50 * 100)) {
        errors.rejectValue("lowPrice", "lowPrice");
    }
    if ((userChoice.getHighPrice().getPriceCents()) > (20000 * 100)) {
        errors.rejectValue("lowPrice", "highPrice");
    }
}