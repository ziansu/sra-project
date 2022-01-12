public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        throw new java.lang.IllegalArgumentException("Expected one argument");
    }
    org.springframework.context.ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("/application-context.xml");
    com.backfield.imagegenerator.ImageGenerator imageGenerator = ((com.backfield.imagegenerator.ImageGenerator) (applicationContext.getBean("imageGenerator")));
    imageGenerator.generateImageForString(args[0]);
}