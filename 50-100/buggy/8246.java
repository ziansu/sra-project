@org.junit.Test
public void shouldReturnAtFitColumnTwoRowZeroOneTwoWithConfoundingFiVertical() {
    toFind = "fit";
    char[][] toSearch = new char[][]{ new char[]{ 'x' , 'f' , 'f' } , new char[]{ 'x' , 'i' , 'i' } , new char[]{ 'x' , 'x' , 't' } };
    grid = new com.paigeruppel.katas.wordsearch.LetterGrid(toSearch);
    com.paigeruppel.katas.wordsearch.WordSearch underTest = new com.paigeruppel.katas.wordsearch.WordSearch(grid);
    org.junit.Assert.assertThat(underTest.find(toFind), org.hamcrest.Matchers.is("fit: (0,2),(1,2),(2,2)"));
}