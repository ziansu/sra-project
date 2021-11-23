@org.springframework.context.annotation.Bean
public springfox.documentation.spring.web.plugins.Docket api() {
    return new springfox.documentation.spring.web.plugins.Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2).pathMapping("/api").select().apis(springfox.documentation.builders.RequestHandlerSelectors.any()).paths(swaggerPaths()).build();
}