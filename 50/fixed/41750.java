@org.springframework.context.annotation.Bean
public demo.api.CommentsApi commentsApi() {
    return mock(demo.api.CommentsApi.class);
}