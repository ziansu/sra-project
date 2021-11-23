@org.springframework.context.annotation.Bean
public demo.api.CommentsApi commentsApi() {
    return org.mockito.Mockito.mock(demo.api.CommentsApi.class);
}