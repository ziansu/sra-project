@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer() {
    org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
    tilesConfigurer.setDefinitions("/WEB-INF/tiles.xml");
    tilesConfigurer.setCheckRefresh(true);
    return tilesConfigurer;
}