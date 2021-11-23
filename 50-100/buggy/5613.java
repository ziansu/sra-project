@org.junit.Test
public void 상속과_형변환() throws java.lang.Exception {
    org.junit.Assert.assertThat(accessChildren.onlyChildren(), org.hamcrest.CoreMatchers.is("onlyChildren"));
    org.junit.Assert.assertThat(accessChildren.getNameByProtected(), org.hamcrest.CoreMatchers.is("Child : AccessParent_Protected"));
    com.study.week1.oop.access.AccessParent accessParentCasted = ((com.study.week1.oop.access.AccessParent) (accessChildren));
    org.junit.Assert.assertThat("parent 로 캐스팅 됐지만, 객체는 여전히 children의 속성을 갖고 있다.", accessParentCasted.getNameByProtected(), org.hamcrest.CoreMatchers.is("AccessParent_Protected"));
}