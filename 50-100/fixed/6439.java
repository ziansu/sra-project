public pl.spring.demo.to.BookTo saveBook(pl.spring.demo.to.BookTo book) {
    java.lang.String url = (SERVER) + "/book";
    pl.spring.demo.to.BookTo returned;
    java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> messageConverters = new java.util.ArrayList<org.springframework.http.converter.HttpMessageConverter<?>>();
    messageConverters.add(new org.springframework.http.converter.json.MappingJackson2HttpMessageConverter());
    restTemplate.setMessageConverters(messageConverters);
    returned = restTemplate.postForObject(url, book, pl.spring.demo.to.BookTo.class);
    return returned;
}