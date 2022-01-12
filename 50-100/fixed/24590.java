@tas.collection.Test
public void multipleMatches() {
    subject.putIfAbsent("cattle", 'w');
    subject.putIfAbsent("cap", 'x');
    subject.putIfAbsent("cat", 'y');
    subject.putIfAbsent("dog", 'z');
    assertThat(subject.keysStartingWith("ca")).containsExactly("cap", "cat", "cattle");
    assertThat(subject.keysStartingWith("cat")).startsWith("cat", "cattle");
    assertThat(subject.keysStartingWith("catt")).startsWith("cattle");
}