@org.junit.Test
public void testAvailable_handlesReadValueOfZero() throws java.io.IOException {
    int contentLength = 999;
    java.io.InputStream is = com.bumptech.glide.util.ContentLengthInputStream.obtain(wrapped, java.lang.String.valueOf(contentLength));
    org.mockito.Mockito.when(wrapped.read()).thenReturn(0);
    com.google.common.truth.Truth.assertThat(is.read()).isEqualTo(0);
    com.google.common.truth.Truth.assertThat(is.available()).isEqualTo((contentLength - 1));
}