public static void main(java.lang.String[] args) {
    org.springframework.core.env.CommandLinePropertySource<?> ps = new org.springframework.core.env.SimpleCommandLinePropertySource(args);
    org.springframework.context.annotation.AnnotationConfigApplicationContext ctx = new org.springframework.context.annotation.AnnotationConfigApplicationContext();
    ctx.getEnvironment().getPropertySources().addFirst(ps);
    ctx.register(org.dawnsci.marketplace.config.ApplicationConfiguration.class);
    ctx.refresh();
    try {
        org.springframework.boot.SpringApplication.run(org.dawnsci.marketplace.MarketplaceApplication.class, args);
    } finally {
        ctx.close();
    }
}