@java.lang.Override
public java.lang.String deleteSlideshow(java.lang.String username, java.lang.String password, java.lang.String slideshowId) {
    org.springframework.web.util.UriComponentsBuilder builder = org.springframework.web.util.UriComponentsBuilder.fromUriString(org.springframework.social.slideshare.api.impl.SlideshowTemplate.DELETE_SLIDESHOW_URL);
    builder.queryParam("username", username);
    builder.queryParam("password", password);
    builder.queryParam("slideshow_id", slideshowId);
    java.lang.String url = builder.build().toUriString();
    org.springframework.social.slideshare.api.impl.xml.SlideshowIdHolder response = this.restOperations.getForObject(url, org.springframework.social.slideshare.api.impl.xml.SlideshowIdHolder.class);
    return response.getId();
}