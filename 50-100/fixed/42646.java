@org.junit.Test
public void shouldReturnLaAtRowOneColumnOneTwoWithConfoundingLHorizontal() {
    toFind = "la";
    char[][] toSearch = new char[][]{ new char[]{ 'l' , 'x' , 'x' } , new char[]{ 'x' , 'l' , 'a' } , new char[]{ 'x' , 'x' , 'x' } };
    com.paigeruppel.katas.wordsearch.WordSearch underTest = new com.paigeruppel.katas.wordsearch.WordSearch(new com.paigeruppel.katas.wordsearch.LetterGrid(toSearch));
    org.junit.Assert.assertThat(underTest.find(toFind), org.hamcrest.Matchers.is("la: (1,1),(1,2)"));
}