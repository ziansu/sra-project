@org.springframework.context.annotation.Bean
public springfox.documentation.spring.web.plugins.Docket apiDocumentationV2() {
    return new springfox.documentation.spring.web.plugins.Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2).groupName("default-group").apiInfo(apiInfo()).select().paths(defaultGroup()).build().securitySchemes(java.util.Arrays.asList(securitySchema())).securityContexts(java.util.Arrays.asList(securityContext()));
}