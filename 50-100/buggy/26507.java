@org.junit.Test
public void constructor_byDefault_createsQuestionsInExpectedFormat() {
    assertThat(game.popQuestions.get(0).toString(), org.hamcrest.CoreMatchers.is("Pop Question 0"));
    assertThat(game.rockQuestions.get(49).toString(), org.hamcrest.CoreMatchers.is("Rock Question 49"));
    assertThat(game.scienceQuestions.get(33).toString(), org.hamcrest.CoreMatchers.is("Science Question 33"));
    assertThat(game.sportsQuestions.get(21).toString(), org.hamcrest.CoreMatchers.is("Sports Question 21"));
}