@org.junit.Test
@org.junit.experimental.categories.Category(value = smartcity.accessibility.categories.UnitTests.class)
public void locationtest1() throws java.lang.Exception {
    java.lang.String res = mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("locationsInRadius?srcLat=31.906953&srcLng=34.992489")).andReturn().getResponse().getContentAsString();
    java.lang.System.out.println(res);
}