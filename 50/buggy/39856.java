@java.lang.Override
public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
    actor.attemptsTo(net.serenitybdd.screenplay.actions.Click.on(Product.ADD_TO_CART.of(product)));
}