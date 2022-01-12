@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.ContentNegotiatingViewResolver contentViewResolver() throws java.lang.Exception {
    org.springframework.web.servlet.view.json.MappingJackson2JsonView jsonView = new org.springframework.web.servlet.view.json.MappingJackson2JsonView();
    jsonView.setContentType("application/json");
    jsonView.setExtractValueFromSingleKeyModel(true);
    org.springframework.web.servlet.view.xml.MarshallingView xmlView = new org.springframework.web.servlet.view.xml.MarshallingView();
    xmlView.setContentType("application/xml");
    org.springframework.web.servlet.view.ContentNegotiatingViewResolver contentViewResolver = new org.springframework.web.servlet.view.ContentNegotiatingViewResolver();
    contentViewResolver.setDefaultViews(java.util.Arrays.<org.springframework.web.servlet.View>asList(jsonView, xmlView));
    return contentViewResolver;
}