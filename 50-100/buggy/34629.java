private void runTestMethod(com.my.decorator.Pizza pizza) {
    if (pizza instanceof com.my.decorator.TomatoSauce)
        ((com.my.decorator.TomatoSauce) (pizza)).tomatoSauceTestMethod();
    else {
        if (!(pizza instanceof com.my.decorator.PlainPizza))
            runTestMethod(((com.my.decorator.ToppingDecorator) (((com.my.decorator.ToppingDecorator) (pizza)).getTempPizza())));
        else
            java.lang.System.out.println("Not a tomato sauce");
        
    }
}