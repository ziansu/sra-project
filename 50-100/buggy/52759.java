@org.junit.Test
public void arrayResponse() throws java.io.IOException {
    this.snippet.expectResponseFields("array-response").withContents(org.springframework.restdocs.test.SnippetMatchers.tableWithHeader("Path", "Type", "Description").row("[]", "String", "one"));
    org.springframework.mock.web.MockHttpServletResponse response = new org.springframework.mock.web.MockHttpServletResponse();
    response.getWriter().append("[\"a\", \"b\", \"c\"]");
    org.springframework.restdocs.payload.PayloadDocumentation.documentResponseFields("array-response", org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath("[]").description("one")).handle(org.springframework.restdocs.test.StubMvcResult.result(response));
}