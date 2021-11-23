@org.junit.Test
public void 랩퍼러_형변환() throws java.lang.Exception {
    float f = 123.4F;
    int i = ((int) (f));
    org.junit.Assert.assertThat("정상", i, org.hamcrest.CoreMatchers.is(123));
    float f2 = i;
    org.junit.Assert.assertThat("데이터가 유실됐다!! primary type은 캐스팅때 조심해야 함.", f2, org.hamcrest.CoreMatchers.is(123.4F));
}