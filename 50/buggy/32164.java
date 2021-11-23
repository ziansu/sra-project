@java.lang.Override
public void run(org.springframework.boot.ApplicationArguments applicationArguments) throws java.lang.Exception {
    pers.nick.ordermanagement.config.DataLoader.all_products = pers.nick.ordermanagement.config.DataLoader.productDAO.findAll();
}