@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesViewResolver tilesViewResolver() {
    org.springframework.web.servlet.view.tiles3.TilesViewResolver tilesViewResolver = new org.springframework.web.servlet.view.tiles3.TilesViewResolver();
    tilesViewResolver.setOrder(1);
    return tilesViewResolver;
}